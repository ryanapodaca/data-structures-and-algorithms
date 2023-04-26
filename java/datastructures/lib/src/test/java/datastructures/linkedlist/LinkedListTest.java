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

  @Test
  public void testAppendSingleNode() {
    LinkedList list = new LinkedList();
    list.append(5);
    assertEquals("5", list.toString());
  }

  @Test
  public void testAppendMultipleNodes() {
    LinkedList list = new LinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    assertEquals("5 -> 10 -> 15", list.toString());
  }

  @Test public void testInsertBeforeNodeInMiddle() {
    LinkedList list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    list.insertBefore(2, 7);
    assertEquals("{ 1 } -> { 7 } -> { 2 } -> { 3 } -> NULL", list.toString());
  }

  @Test
  public void testInsertBeforeFirstNode() {
    LinkedList list = new LinkedList();
    list.append(1);
    list.append(2);
    list.insertBefore(1, 2);
    assertEquals("{ 2 } -> { 1 } -> { 2 } -> NULL", list.toString());
  }

  @Test
  public void testInsertAfterNodeInMiddle() {
    LinkedList list = new LinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    list.insertAfter(10, 12);
    assertEquals("{ 5 } -> { 10 } -> { 12 } -> { 15 } -> NULL", list.toString());
  }

  @Test
  public void testInsertAfterLastNode() {
    LinkedList list = new LinkedList();
    list.append(5);
    list.append(10);
    list.insertAfter(10, 12);
    assertEquals("{ 5 } -> { 10 } -> { 12 } -> NULL", list.toString());
  }

  @Test void testKthFromEndWithKGreaterThanLength() {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    ll.insert(2);
    assertThrows(RuntimeException.class, () -> ll.kthFromEnd(5));
  }

  @Test void testKthFromEndWithKEqualToLength() {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    assertEquals(3, ll.kthFromEnd(3));
  }

  @Test void testKthFromEndWithKNotPositive() {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);

    assertThrows(RuntimeException.class, () -> ll.kthFromEnd(-1));
  }

  @Test void testKthFromEndWithSize1List() {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    assertEquals(1, ll.kthFromEnd(1));
  }

  @Test void testKthFromEndWithKInTheMiddle() {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    assertEquals(2, ll.kthFromEnd(2));
  }

}
