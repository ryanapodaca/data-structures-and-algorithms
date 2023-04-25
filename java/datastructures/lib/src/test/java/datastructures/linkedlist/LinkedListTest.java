package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
  @Test void testInstantiateEmptyLL() {
      LinkedList list = new LinkedList();
      assertNull(list.toString());
    }

  @Test void insertTest(){
    LinkedList list = new LinkedList();
    list.insert(5);
    assertTrue(list.includes(5));

  }

  @Test void testHead() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertEquals(3,list.getHead().getValue());
  }

  @Test public void testInsertMultipleNodes() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertEquals(3, list.getHead().getValue());
    assertEquals(2, list.getHead().getNext().getValue());
    assertEquals(1, list.getHead().getNext().getNext().getValue());
  }

  @Test public void testFindExistingValue() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertTrue(list.includes(2));
  }

  @Test public void testFindNonExistingValue() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertFalse(list.includes(4));
  }

  @Test public void testReturnAllValues() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL", list.toString());
  }


}
