package datastructures.linkedlist;

import org.junit.jupiter.api.Test;


import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTests {
  @Test void testInstantiateTree(){
    BinaryTree<Object> newTree = new BinaryTree<>();
    assertNotNull(newTree);

  }

  @Test void testAddRoot(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(1);
    assertNotNull(newTree.root);
  }

  @Test void testAddLeftAndRightNode(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(1);
    newTree.add(2);
    newTree.add(3);
    assertEquals(Integer.valueOf(1), newTree.root.value);
//    assertEquals(Integer.valueOf(2), newTree.root.leftNode.value);
//    assertEquals(Integer.valueOf(3), newTree.root.rightNode.value);

  }

  @Test void testPreOrderInOrderPostOrderCollections(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(1);
    newTree.add(2);
    newTree.add(3);
//    assertEquals(1, newTree.root.leftNode);
//    assertEquals(3, newTree.root.rightNode);
    assertNotNull(newTree.preOrder(newTree.root));
    assertNotNull(newTree.inOrder(newTree.root));
    assertNotNull(newTree.postOrder(newTree.root));
  }

  @Test void testContains(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(1);
    newTree.add(2);
    newTree.add(3);
    assertTrue(newTree.contains(1));
    assertTrue(newTree.contains(2));
    assertFalse(newTree.contains(4));
  }
}
