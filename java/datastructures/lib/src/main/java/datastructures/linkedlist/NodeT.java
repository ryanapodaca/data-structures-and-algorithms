package datastructures.linkedlist;

public class NodeT<T> {
  T value;
  NodeT<T> next;

  public NodeT(T value) {
    this.value = value;
    this.next = null;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public NodeT<T> getNext() {
    return next;
  }

  public void setNext(NodeT<T> next) {
    this.next = next;
  }
}
