package datastructures.linkedlist;

import java.util.EmptyStackException;

public class Queue<T>
{
  public NodeT<T> front;
  NodeT<T> back;

  public void enqueue(T valueToEnqueue)
  {
    NodeT<T> newNode = new NodeT<T>(valueToEnqueue);
    if(back == null) {
      front = newNode;
      back = newNode;
    } else{
      back.next = newNode;
      back = newNode;
    }
  }

  public T dequeue()
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

  public boolean isEmpty()
  {
    if (front == null)
      return true;
    else
      return false;
  }
}
