close all;
clear all;

w = 4;
fs = 44100;

f = 1000;
A = 1;
N = 3001;

Q = 2/2^w;

% 0: kein Noise shaping, kein dither
% 1: mit Noise shaping, kein dither
% 2: kein Noise shaping, mit dither
% 3: mit Noise shaping, mit dither
iModus = 3;

L = 2;
fLPN = 100;

%% Eingangssignal

n = 0:N-1;
x = A * sin(2*pi*n*f/fs);

%% Aufwärttastung mit Tiefpassfilterung

fInterSectionWidth = 1/10 * 1/L;

fLP = [0 1/L-fInterSectionWidth 1/L+fInterSectionWidth 1];
aLP = [1 1 0 0];

hLP = firpm(fLPN, fLP, aLP);

GrpDelayhLP = grpdelay(hLP);
GrpDelayhLP = GrpDelayhLP(1);

%fvtool(hLP)

% Nullen einfügen
xUP = L * upsample(x,L);
% Filter anwenden
xUP = filter(hLP,1,xUP);
% Einschwingbereich wegschneiden
xUP = xUP(GrpDelayhLP+1:end);

nUP = 0:1/L:(N-(GrpDelayhLP+1)/L);
NUP = length(nUP);

%% Dither erzeugen

dither = Q * (2 * rand(1, NUP) -1);

figure(3)
grid on; hold on;
subplot(211)
plot(nUP,dither/Q, 'DisplayName', 'dither')
ylabel('d/Q')
title('dither')
subplot(212)
hist(dither)

%% Quantisierung auf W bit

if (iModus == 0) || (iModus == 2)
    % kein noise shaping
    h = [ 0 ];
elseif (iModus == 1) || (iModus == 3)
    % erster ordnung
    h = [ 1 ]; k = 1;
    % zweite ordnung
    h = [+2 -1 0]; k = 2;
end

TapDelayLine = zeros(1, length(h));

for ic=1:NUP
    % Filterung des Quantiesierungsfehlers
    eFiltered = sum(h .* TapDelayLine);
    % Quantisierung
    xmod = xUP(ic) - eFiltered;
    if (iModus == 2) || (iModus == 3)
        xUpqr(ic) = Q * floor( (xmod + dither(ic))/Q + 0.5 );
    elseif (iModus == 0) || (iModus == 1)
        xUpqr(ic) = Q * floor( xmod/Q + 0.5 );
    end
    
    % Fehler der Quantisierung
    e = xUpqr(ic) - xmod;
    TapDelayLine = [ e TapDelayLine(1:end-1) ];
end

%% Abwärtstastung mit vorheriger Tiefpassfilterung

% Filter anwenden
xUpDownFiltered = filter(hLP,1,xUpqr);
% Einschwingbereich wegschneiden
xUpDown = xUpDownFiltered(GrpDelayhLP+1:end);
% Downsampling
xDown = downsample(xUpDown, L);

er = xUpDown - xUP(1:length(xUpDown));

NDown = length(xDown);
nDown = 0:1:NDown-1;

%% Zeitsignal Darstellen

figure(1)
subplot(411)
grid on; hold on;
plot(n,x,'DisplayName','in');
plot(nUP,xUpqr,'r','DisplayName','quantisiert');
xlim([0 100])
legend('show', 'location', 'best')

subplot(412)
grid on; hold on;
plot(n,x,'DisplayName','in');
plot(nUP,xUP,'r','DisplayName','in upsampled');
xlim([0 100])
legend('show', 'location', 'best')

subplot(413)
grid on; hold on;
plot(n,x,'DisplayName','in');
plot(nDown,xDown,'r','DisplayName','quantisiert down');
xlim([0 100])
legend('show', 'location', 'best')

subplot(414)
grid on; hold on;
plot(nUP(1:length(er)), er ,'DisplayName','Quantisierungsfehler');
xlim([0 100])
legend('show', 'location', 'best')

%% Spektrum darstellen

Nfft = 1024;

Xdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(x, Nfft) ) );
XUPdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(xUP, Nfft) ) );
XUPqrdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(xUpqr, Nfft) ) );
XDownqrdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(xDown, Nfft) ) );

fFFT = (0:Nfft-1)/Nfft * fs;
fLFFT = (0:Nfft-1)/Nfft * L * fs;

figure(2)
grid on; hold on;
plot(fFFT, Xdb, 'DisplayName', 'in')
plot(fLFFT, XUPdb, 'black', 'DisplayName', 'in upsampled')
plot(fLFFT, XUPqrdb,'r','DisplayName','quantisiert upsampled');
plot(fFFT, XDownqrdb,'g','DisplayName','quantisiert downsampled');
ylabel('dB')
xlabel('f/fs')
legend('show', 'location', 'best')

%% SNR

SNRdB = 10 * log10( var(xUP)/var(er));

SNRtheoretisch = 6.02 * w + 1.76;

disp(sprintf('SNR = %g dB (%g dB theoretisch)', SNRdB, SNRtheoretisch))