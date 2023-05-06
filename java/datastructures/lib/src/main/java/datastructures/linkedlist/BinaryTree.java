package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<T> {
  TreeNode<T> root;

  public Object[] preOrder(TreeNode<T> node){
    Object[] outputValues;
    ArrayList<Object> list = new ArrayList<>();

    list.add(node.value);

    if(node.leftNode != null)
      list.addAll(Arrays.asList(preOrder(node.leftNode)));

    if(node.rightNode != null)
      list.addAll(Arrays.asList(preOrder(node.rightNode)));

    outputValues = list.toArray();

    return outputValues;
  }

  public Object[] inOrder(TreeNode<T> node){
    Object[] outputValues;
    ArrayList<Object> list = new ArrayList<>();

    if (node.leftNode != null) {
      list.addAll(Arrays.asList(inOrder(node.leftNode)));
    }

    list.add(node.value);

    if (node.rightNode != null) {
      list.addAll(Arrays.asList(inOrder(node.rightNode)));
    }

    outputValues = list.toArray();

    return outputValues;

  }

  public Object[] postOrder(TreeNode<T> node){
    Object[] outputValues;
    ArrayList<Object> list = new ArrayList<>();

    if (node.leftNode != null) {
      list.addAll(Arrays.asList(inOrder(node.leftNode)));
    }


    if (node.rightNode != null) {
      list.addAll(Arrays.asList(inOrder(node.rightNode)));
    }

    list.add(node.value);

    outputValues = list.toArray();

    return outputValues;

  }
}
