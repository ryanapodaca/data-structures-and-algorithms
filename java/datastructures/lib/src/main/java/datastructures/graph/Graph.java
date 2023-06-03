package datastructures.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex<T> newVertex = new Vertex<>(value);
    adjacencyLists.put(newVertex, new LinkedList<>());
    numberOfVertices++;
    return newVertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    LinkedList<Edge<T>> edges = adjacencyLists.get(start);
    Edge<T> newEdge = new Edge<>(destination, weight);
    edges.add(newEdge);
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    return new LinkedList<>(adjacencyLists.keySet());

  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    return adjacencyLists.get(vertex);
  }

  public int size()
  {
    return numberOfVertices;
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    // Good for testing
    // WARNING: Your HashMap does not guarantee ordering!
    // But you can basically rely on it if you add nodes to your graphs in a consistent way

    return adjacencyLists.toString();
  }
}
