package codechallenges.trees;

import datastructures.linkedlist.BinaryTree;
import datastructures.linkedlist.Queue;
import datastructures.linkedlist.TreeNode;

public class TreeMax extends BinaryTree<TreeNode> {
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
