package codechallenges.trees;

import datastructures.linkedlist.BinaryTree;
import org.junit.jupiter.api.Test;

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
}
