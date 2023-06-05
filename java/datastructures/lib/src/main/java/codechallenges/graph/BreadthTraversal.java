package codechallenges.graph;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import datastructures.linkedlist.Queue;

import java.util.*;

public class BreadthTraversal {
  public static ArrayList<String> getGraphValues(Graph graph) {
    if(graph == null) {
      return null;
    }
    Queue<Vertex<String>> unvisitedQueue = new Queue<>();
    Set<Vertex<String>> visitedHashSet = new HashSet<>();
    ArrayList<String> graphValues = new ArrayList<>();

    LinkedList<Vertex<String>> vertexes = graph.getVertices();
    Vertex<String> firstVertex = vertexes.getFirst();

    unvisitedQueue.enqueue(firstVertex);
    visitedHashSet.add(firstVertex);


    while(!unvisitedQueue.isEmpty()) {
      Vertex<String> currVertex = unvisitedQueue.dequeue();
      graphValues.add(currVertex.value);

      LinkedList<Edge<String>> edges = graph.getNeighbors(currVertex);
      for (Edge<String> currEdge : edges) {
        if (!visitedHashSet.contains(currEdge.destination)){
          visitedHashSet.add(currEdge.destination);
          unvisitedQueue.enqueue(currEdge.destination);
        }
      }
    }
    return graphValues;
  }
}
