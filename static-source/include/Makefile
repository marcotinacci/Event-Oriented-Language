# EOLGenerationSupport makefile
CC=g++
CFLAGS= -c -Wall -O6
# lista dei file sorgenti
SOURCES=main.cpp Handler.cpp Event.cpp
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=eolgenerationsupport

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE) : $(OBJECTS)
	$(CC) $(OBJECTS) -fopenmp -o $@
.cpp.o:
	$(CC) $(CFLAGS) $< -o $@

clean:
	rm -rf *.o *~ *.bak $(EXECUTABLE)
