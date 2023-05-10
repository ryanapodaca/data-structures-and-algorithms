package codechallenges.trees;

import datastructures.linkedlist.KTreeNode;
import datastructures.linkedlist.KaryTree;
import datastructures.linkedlist.Queue;

public class KaryFIZZBUZZ {
  static KaryTree<KTreeNode<Integer>> karyFizzBuzzTransform(KaryTree<KTreeNode<Integer>> tree) {
    if (tree == null ||tree.root == null)
      return null;

    KaryTree fizzBuzzTree = new KaryTree<>();

    Queue<KTreeNode> queue = new Queue<>();

    queue.enqueue(tree.root);

    while (!queue.isEmpty()) {
      KTreeNode node = queue.dequeue();

      if ((int) node.value % 3 == 0)
        fizzBuzzTree.add("Fizz");
      else if ((int) node.value % 5 == 0)
        fizzBuzzTree.add("Buzz");
      else if ((int) node.value % 5 == 0 && (int) node.value % 3 == 0)
        fizzBuzzTree.add("FizzBuzz");

      for (int i = 0; i < tree.k; i++) {
        KTreeNode child = (KTreeNode) node.nodes.get(i);
        queue.enqueue(child);
      }
    }
    return fizzBuzzTree;
  }
}

