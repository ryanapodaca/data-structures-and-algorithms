package codechallenges.trees;

import datastructures.linkedlist.BinaryTree;
import datastructures.linkedlist.KaryTree;
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


  @Test void testTreeBreadthArrayReturn(){

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

  @Test void testTreeBreadthArrayReturnWithNegatives(){

    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.add(-1);
    tree.add(4);
    tree.add(5);


    // Convert the expected array to an ArrayList
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1,4,5));
    assertEquals(expected, treeBreadthArrayReturn(tree));
  }

//  public static void main(String[] args) {
//    KaryTree<Integer> tree = new KaryTree<>();
//    tree.add(1);
//    tree.add(2);
//    tree.add(3);
//    tree.add(4);
//    tree.add(5);
//    tree.add(6);
//    tree.add(7);
//
//    // The resulting tree should have the structure:
//    //       1
//    //     /   \
//    //    2     3
//    //   / \   / \
//    //  4   5 6   7
//
//    // Check the root node
//    assert(tree.root.value == 1);
//
//    // Check the first level
//    assert(tree.root.nodes.get(0).value == 2);
//    assert(tree.root.nodes.get(1).value == 3);
//
//    // Check the second level
//    assert(tree.root.nodes.get(0).nodes.get(0).value == 4);
//    assert(tree.root.nodes.get(0).nodes.get(1).value == 5);
//    assert(tree.root.nodes.get(1).nodes.get(0).value == 6);
//    assert(tree.root.nodes.get(1).nodes.get(1).value == 7);
//  }


}
