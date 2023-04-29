package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  @Test void testPush() {
    Stack stack = new Stack();
    stack.push(1);
    assertEquals(1, stack.peek());
  }

  @Test void testPushMultiple() {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    assertEquals(3, stack.peek());
  }

  @Test void testPop() {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.pop());
  }

  @Test void testEmptyStack() {
    Stack stack = new Stack();
    stack.push(1);
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  @Test void testPeek() {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.peek());
  }

  @Test
  void testCreateEmptyStack() {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  }

  @Test void testPopWhenEmpty() {
    Stack stack = new Stack();
    assertThrows(EmptyStackException.class, () -> stack.pop());
  }

  @Test
  void testPeekWhenEmpty() {
    Stack stack = new Stack();
    assertThrows(EmptyStackException.class, () -> stack.peek());
  }

}
