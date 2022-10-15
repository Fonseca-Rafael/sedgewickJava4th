.PHONY: clean

OBJ = e1_1_14.class

all: $(OBJ)
	$(info ----> build done for $(OBJ))

clean:
	$(info ----> cleaning class files)
	-rm -f *.class

%.class: %.java
		   javac $^
