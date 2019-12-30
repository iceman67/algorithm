.SUFFIXES : .c .o
CC = g++
CFLAGS = -g -Wall -ansi
 all: test

OBJS = Graph.o PriorityQueue.o ShortestPath.o Test_ShortestPath.o
SRCS = $(OBJS:.o=.c)

test: $(OBJS)
	$(CC) -o Dijkstra $(OBJS) 

clean: 
	rm -rf $(OBJS)
distclean: 
	rm -rf $(OBJS) Dijkstra test
