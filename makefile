# Makefile
# Bonnie Mansvelt
# MNSBON012


JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	BarrierS/BarrierTest.java \
	BarrierS/BThread.java \
	BarrierS/Barrier.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) BarrierS/*.class
