package datastructures.linkedlist;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {
  public void add(T value) {
    TreeNode<T> newNode = new TreeNode<>(value);

    if(root==null)
      root = newNode;
    else {
      TreeNode<T> tempNode = root;
      while(true){
        int comparison = value.compareTo(tempNode.value);
        //compareTo() returns a -1 if smaller, and 1 if bigger.
        if(comparison < 0){
          if(tempNode.leftNode == null) {
            tempNode.leftNode = newNode;
            break;
          }
          else
            tempNode = tempNode.leftNode;
        }

        else if (comparison > 0) {
          if(tempNode.rightNode == null) {
            tempNode.rightNode = newNode;
            break;
          }
          else
            tempNode = tempNode.rightNode;
        }
        else
          //value already exists in tree
          return;
      }
    }

  }

  public boolean contains(T value) {
    Object[] compareValues = preOrder(root);

    for (Object comparison : compareValues) {
      if (comparison.equals(value))
        return true;
    }
    return false;
  }
}

