close all;
clear all;

w = 4;
fs = 44100;

f = 1000;
A = 0.5;
N = 3001;

Q = 2/2^w;

% 0: kein Noise shaping, kein dither
% 1: mit Noise shaping, kein dither
% 2: kein Noise shaping, mit dither
% 3: mit Noise shaping, mit dither
iModus = 3;

%% Eingangssignal

n = 0:N-1;
x = A * sin(2*pi*n*f/fs);

%% Dither erzeugen

dither = Q * (2 * rand(1, N) -1);

figure(3)
grid on; hold on;
subplot(211)
plot(n,dither/Q, 'DisplayName', 'dither')
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
    h = [ 1 ];
    % zweite ordnung
    h = [+2 -1 0];
end

TapDelayLine = zeros(1, length(h));

for ic=1:N
    % Filterung des Quantiesierungsfehlers
    eFiltered = sum(h .* TapDelayLine);
    % Quantisierung
    xmod = x(ic) - eFiltered;
    if (iModus == 2) || (iModus == 3)
        xqr(ic) = Q * floor( (xmod + dither(ic))/Q + 0.5 );
    elseif (iModus == 0) || (iModus == 1)
        xqr(ic) = Q * floor( xmod/Q + 0.5 );
    end
    
    % Fehler der Quantisierung
    e = xqr(ic) - xmod;
    TapDelayLine = [ e TapDelayLine(1:end-1) ];
end

er = x - xqr;

%% Darstellen


figure(1)
subplot(211)
grid on; hold on;
plot(n,x,'DisplayName','in');
plot(n,xqr,'r','DisplayName','quantisiert');
xlim([0 100])
%ylim([-w*Q*2 w*Q*2])
legend('show', 'location', 'best')
subplot(212)
grid on; hold on;
plot(n, er ,'DisplayName','Quantisierungsfehler');
xlim([0 100])
%ylim([-w*Q*2 w*Q*2])
legend('show', 'location', 'best')


%% Spektrum darstellen

Nfft = 1024;

Xdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(x, Nfft) ) );
Xqrdb = 10 * log10( 1/sqrt(Nfft)* abs( fft(xqr, Nfft) ) );

fFFT = (0:Nfft-1)/Nfft * fs;

figure(2)
plot(fFFT, Xdb, 'DisplayName', 'in')
grid on; hold on;
plot(fFFT, Xqrdb,'r','DisplayName','quantisiert');
ylabel('dB')
xlabel('f/fs')
legend('show', 'location', 'best')

%% SNR

SNRdB = 10 * log10( var(x)/var(er));

SNRtheoretisch = 6.02 * w + 1.76;

disp(sprintf('SNR = %g dB (%g dB theoretisch)', SNRdB, SNRtheoretisch))