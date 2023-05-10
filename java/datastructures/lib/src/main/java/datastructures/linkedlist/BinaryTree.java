package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<T> {
  public TreeNode<T> root;

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

  public void add(T value) {
    TreeNode<T> newNode = new TreeNode<>(value);

    if (root == null) {
      root = newNode;
      return;
    }

    Queue<TreeNode<T>> queue = new Queue<>();
    queue.enqueue(root);

    while (!queue.isEmpty()) {
      TreeNode<T> node = queue.dequeue();

      if (node.leftNode == null) {
        node.leftNode = newNode;
        return;
      } else {
        queue.enqueue(node.leftNode);
      }

      if (node.rightNode == null) {
        node.rightNode = newNode;
        return;
      } else {
        queue.enqueue(node.rightNode);
      }
    }
  }

  public Integer findMaxFromBinaryTree(){
    if (root == null){
      return null;
    }

    Queue<TreeNode> breadth = new Queue();

    Integer max = Integer.MIN_VALUE;

    breadth.enqueue(root);

    while (!breadth.isEmpty()){

      TreeNode front = breadth.dequeue();

      if (front.leftNode != null) {
        breadth.enqueue(front.leftNode);
      }

      if (front.rightNode != null) {
        breadth.enqueue(front.rightNode);
      }


      if (max < (Integer)front.value) {
        max = (Integer)front.value;
      }

    }
    return max;
  }

}
