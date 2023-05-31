package codechallenges.TreeIntersection;

import datastructures.linkedlist.BinaryTree;
import datastructures.linkedlist.HashTable;
import datastructures.linkedlist.TreeNode;

import java.util.ArrayList;

public class TreeIntersection {
  public ArrayList<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2) {
    ArrayList<Integer> commonInts = new ArrayList<>();
    HashTable<Integer, Integer> table = new HashTable<>();

    preorderAddToHashTable(tree1.root, table);
    preorderSearchCommonValues(tree2.root, table, commonInts);

    return commonInts;

  }

  public void preorderAddToHashTable(TreeNode<Integer> root, HashTable<Integer, Integer> table) {
    if (root == null) {
      return;
    }

    table.set(root.value, root.value);

    preorderAddToHashTable(root.leftNode, table);
    preorderAddToHashTable(root.rightNode, table);

  }

  public void preorderSearchCommonValues(TreeNode<Integer> root, HashTable<Integer, Integer> table, ArrayList<Integer> commonInts) {
    if (root == null) {
      return;
    }

    if (table.has(root.value))
      commonInts.add(root.value);


    preorderSearchCommonValues(root.leftNode, table, commonInts);
    preorderSearchCommonValues(root.rightNode, table, commonInts);
  }


}
