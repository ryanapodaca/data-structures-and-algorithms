package codechallenges.trees;

import datastructures.linkedlist.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static codechallenges.trees.TreeBreadthTraversal.treeBreadthArrayReturn;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TreesChallengeTests {
  @Test void testNullTreeFindMax(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    assertNull(tree.findMaxFromBinaryTree());
  }

  @Test void testTreeFindMax(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(6);
    assertEquals(6,tree.findMaxFromBinaryTree());
  }

  @Test void testTreeFindMaxWithNegatives(){
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.add(1);
    tree.add(2);
    tree.add(-3);
    tree.add(4);
    tree.add(-5);
    tree.add(-6);
    assertEquals(4,tree.findMaxFromBinaryTree());
  }


  @Test
  void testTreeBreadthArrayReturn(){

    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.add(2);
    System.out.println(tree.root.value);
    tree.add(7);
    System.out.println(tree.root.leftNode.value);
    tree.add(5);
    System.out.println(tree.root.rightNode.value);
    tree.add(2);
    System.out.println(tree.root.leftNode.leftNode.value);
    tree.add(6);
    System.out.println(tree.root.leftNode.rightNode.value);
    tree.add(9);
    tree.add(5);

    // Convert the expected array to an ArrayList
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 7, 5, 2, 6, 9, 5));
    assertEquals(expected, treeBreadthArrayReturn(tree));
  }

}
