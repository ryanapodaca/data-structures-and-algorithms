package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  @Test void testEnqueue() {
    Queue queue = new Queue();
    queue.enqueue(1);
    assertEquals(1, queue.peek());
  }

  @Test void testEnqueueMultiple() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(1, queue.peek());
  }

  @Test void testDequeue() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    assertEquals(1, queue.dequeue());
  }

  @Test void testPeek() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    assertEquals(1, queue.peek());
  }

  @Test void testEmpty() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.dequeue();
    assertTrue(queue.isEmpty());
  }

  @Test void testCreateEmptyQueue() {
    Queue queue = new Queue();
    assertTrue(queue.isEmpty());
  }

  @Test void testDequeueWhenEmpty() {
    Queue queue = new Queue();
    assertThrows(EmptyStackException.class, () -> queue.dequeue());
  }

  @Test void testPeekWhenEmpty() {
    Queue queue = new Queue();
    assertThrows(EmptyStackException.class, () -> queue.peek());
  }
}
