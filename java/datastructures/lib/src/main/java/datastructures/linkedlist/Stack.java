package datastructures.linkedlist;

import java.util.EmptyStackException;

public class Stack<T>
{
  NodeT<T> top;

  public void push(T valueToPush)
  {
    NodeT<T> newNode = new NodeT<T>(valueToPush);
    newNode.next = top;
    top = newNode;
  }

  public T pop()
  {
    if (top == null)
      throw new EmptyStackException();

    T valueToReturn = top.value;
    top = top.next;

    return valueToReturn;
  }

  public T peek()
  {
    if (top == null)
      throw new EmptyStackException();

    return top.value;
  }

  public boolean isEmpty()
  {
    if (top == null)
      return true;
     else
      return false;

  }
}
