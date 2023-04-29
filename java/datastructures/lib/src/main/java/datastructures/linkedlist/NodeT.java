package datastructures.linkedlist;

public class NodeT<T> {
  T value;
  NodeT<T> next;

  public NodeT(T value) {
    this.value = value;
    this.next = null;
  }

}
