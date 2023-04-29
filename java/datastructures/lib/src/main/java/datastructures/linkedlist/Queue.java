package datastructures.linkedlist;

import java.util.EmptyStackException;

public class Queue<T>
{
  NodeT<T> front;
  NodeT<T> back;

  void enqueue(T valueToEnqueue)
  {
    NodeT<T> newNode = new NodeT<T>(valueToEnqueue);
    if(back == null) {
      front = newNode;
      back = newNode;
    } else{
      newNode.next = back;
      back = newNode;
    }
  }

  T dequeue()
  {
    if(front == null)
      throw new EmptyStackException();

    T value = front.value;
    front = front.next;
    //Need to consider when queue is totally empty...
    if(front == null){
      back = null;
    }
    return value;
  }

  T peek()
  {
    if(front == null)
      throw new EmptyStackException();
    return front.value;
  }

  boolean isEmpty()
  {
    if (front == null)
      return true;
    else
      return false;
  }
}
