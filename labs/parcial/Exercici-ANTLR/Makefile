
ANTLR3=$(PWD)/../antlr3

all : classes/Dot.class

DotParser.java : Dot.g
	java -cp $(ANTLR3)/antlr-3.4-complete.jar:$(ANTLR3)/antlrworks-1.4.3.jar:$(CLASSPATH) -jar $(ANTLR3)/antlr-3.4-complete.jar Dot.g

classes/Dot.class : Dot.java DotParser.java DotLexer.java
	mkdir -p classes
	javac -cp $(ANTLR3)/antlrworks-1.4.3.jar:$(ANTLR3)/antlr-3.4-complete.jar -d classes *.java

clean : 
	rm -rf classes DotLexer.java DotParser.java Dot.tokens
