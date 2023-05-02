package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {
  @Test void testEnqueue(){
    PseudoQueue pseudoQueue = new PseudoQueue();
    pseudoQueue.enqueue(5);
    assertEquals(5, pseudoQueue.stack1.peek());
  }

  @Test void testDequeue(){
    PseudoQueue pseudoQueue = new PseudoQueue();
    pseudoQueue.enqueue(5);
    pseudoQueue.enqueue(10);
    pseudoQueue.enqueue(15);
    assertEquals(5,pseudoQueue.dequeue());
  }

}
