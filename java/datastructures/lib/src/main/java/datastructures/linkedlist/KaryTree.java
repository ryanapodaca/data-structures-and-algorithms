package datastructures.linkedlist;

public class KaryTree<T> {
  public KTreeNode<T> root;
  public int k;

  public void add(T value) {
    KTreeNode<T> newNode = new KTreeNode<>(value);

    if (root == null) {
      root = newNode;
      return;
    }

    Queue<KTreeNode<T>> queue = new Queue<>();
    queue.enqueue(root);
    int nodesAtLevel = 1;
    int nodesAtNextLevel = 0;
    int level = 0;

    while (!queue.isEmpty()) {
      KTreeNode<T> node = queue.dequeue();
      nodesAtLevel--;

      if (node.nodes.size() < k || node.nodes == null) {
        node.nodes.add(newNode);
        return;
      } else {
        for (int i = 0; i < k; i++) {
          KTreeNode<T> child = node.nodes.get(i);
          queue.enqueue(child);
          nodesAtNextLevel++;
        }
      }

      if (nodesAtLevel == 0) {
        level++;
        nodesAtLevel = nodesAtNextLevel;
        nodesAtNextLevel = 0;
      }

      if (nodesAtLevel == Math.pow(k, level) - 1) {
        // If we reach here, it means the tree is full up to level 'level-1',
        // and we need to add a new level with the new node as its root
        KTreeNode<T> newLevelRoot = new KTreeNode<>(value);
        newLevelRoot.nodes.add(root);
        newLevelRoot.nodes.add(newNode);
        root = newLevelRoot;
      } else {
        KTreeNode<T> newLevelNode = queue.dequeue();
        newLevelNode.nodes.add(newNode);
        nodesAtNextLevel += k;
      }
    }

  }


}
