package codechallenges.trees;

import datastructures.linkedlist.BinaryTree;
import datastructures.linkedlist.Queue;
import datastructures.linkedlist.TreeNode;


import java.util.ArrayList;

public class TreeBreadthTraversal {
  public static ArrayList<Integer> treeBreadthArrayReturn(BinaryTree<Integer> tree) {
    ArrayList<Integer> array = new ArrayList<>();

    Queue<TreeNode<Integer>> queue = new Queue<>();

    queue.enqueue(tree.root);

    while(!queue.isEmpty()) {

      TreeNode<Integer> front = queue.dequeue();

      array.add(front.value);

      if(front.leftNode != null) {
        queue.enqueue(front.leftNode);
      }

      if(front.rightNode != null) {
        queue.enqueue(front.rightNode);
      }
    }
    return array;
  }
}
