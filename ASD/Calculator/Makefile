CC=g++
CFLAGS=-c -Wall -std=c++14
LDFLAGS=
SOURCES=main.cpp Calculator.cpp scanner.cpp scanner_impl.cpp symbol.cpp
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=Calculator

all: $(SOURCES) $(EXECUTABLE)
	
$(EXECUTABLE): $(OBJECTS) 
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CC) $(CFLAGS) $< -o $@

clean:
	rm -rf *.o $(OBJECTS) $(EXECUTABLE)
