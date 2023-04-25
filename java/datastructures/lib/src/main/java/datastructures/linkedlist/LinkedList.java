package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList
{
  public Node head = null;
  Node tail = null;

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.setNext(head);
    head = newNode;
  }
  public boolean includes(int value) {
    Node current = head;
    while (current != null){
      if (current.getValue() == value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }
  @Override
  public String toString() {
    if (head == null)
      return null;

    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null) {
      sb.append("{ ");
      sb.append(current.getValue());
      sb.append(" } -> ");
      current = current.getNext();
    }
    sb.append("NULL");
    return sb.toString();
    }

  public Node getHead() {
    return this.head;
  }

  public void append(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode.getNext() != null) {
      currNode = currNode.getNext();
    }
    currNode.setNext(newNode);
  }

  public void insertBefore(int value, int newValue) {
    Node newNode = new Node(newValue);

    if (head == null) {
      head = newNode;
      return;
    }

    if (head.getValue() == value) {
      newNode.setNext(head);
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode.getNext() != null) {
      if (currNode.getNext().getValue() == value) {
        newNode.setNext(currNode.getNext());
        currNode.setNext(newNode);
        return;
      }
      currNode = currNode.getNext();
    }
  }

  public void insertAfter(int value, int newValue) {
    Node newNode = new Node(newValue);

    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode != null) {
      if (currNode.getValue() == value) {
        newNode.setNext(currNode.getNext());
        currNode.setNext(newNode);
        return;
      }
      currNode = currNode.getNext();
    }
  }
}
