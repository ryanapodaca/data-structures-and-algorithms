package datastructures.linkedlist;

import java.util.ArrayList;

public class KTreeNode<T> {
  public T value;

  public ArrayList<KTreeNode<T>> nodes;

  public KTreeNode(T value) {
    this.value = value;
  }
}
