# Makefile
# Bonnie Mansvelt
# MNSBON012


JAVAC =/usr/bin/javac
.SUFFIXES: .java .class

.java.class:
	javac -g -d bin/ -cp bin/ $*.java

CLASSES = \
	src/BarrierS/Barrier.java \
	src/BarrierS/BThread.java \
	src/BarrierS/BarrierTest.java 
	
	

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) bin/BarrierS/*.class

