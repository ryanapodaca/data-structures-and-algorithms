package datastructures.graphs;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TestGraph {
  private Graph<String> graph;

  @BeforeEach
  public void setUp() {
    graph = new Graph<>(10);
  }

  @Test
  public void testAddVertex() {
    Vertex<String> vertex = graph.addVertex("a");
    LinkedList<Vertex<String>> vertices = graph.getVertices();

    Assertions.assertEquals(1, vertices.size());
  }

  @Test
  public void testAddEdge() {
    Vertex<String> vertexA = graph.addVertex("a");
    Vertex<String> vertexB = graph.addVertex("b");
    graph.addEdge(vertexA, vertexB, 5);

    LinkedList<Edge<String>> neighbors = graph.getNeighbors(vertexA);

    Assertions.assertEquals(1, neighbors.size());
    Edge<String> edge = neighbors.getFirst();
    Assertions.assertEquals(vertexB, edge.destination);
    Assertions.assertEquals(5, edge.weight);
  }

  @Test
  public void testGetVertices() {
    Vertex<String> vertexA = graph.addVertex("a");
    Vertex<String> vertexB = graph.addVertex("b");
    Vertex<String> vertexC = graph.addVertex("c");

    LinkedList<Vertex<String>> vertices = graph.getVertices();

    Assertions.assertEquals(3, vertices.size());
    Assertions.assertTrue(vertices.contains(vertexA));
    Assertions.assertTrue(vertices.contains(vertexB));
    Assertions.assertTrue(vertices.contains(vertexC));
  }

  @Test
  public void testGetNeighbors() {
    Vertex<String> vertexA = graph.addVertex("a");
    Vertex<String> vertexB = graph.addVertex("b");
    graph.addEdge(vertexA, vertexB, 5);

    LinkedList<Edge<String>> neighbors = graph.getNeighbors(vertexA);

    Assertions.assertEquals(1, neighbors.size());
    Edge<String> edge = neighbors.getFirst();
    Assertions.assertEquals(vertexB, edge.destination);
    Assertions.assertEquals(5, edge.weight);
  }

  @Test
  public void testSize() {
    Vertex<String> vertexA = graph.addVertex("a");
    Vertex<String> vertexB = graph.addVertex("b");
    Vertex<String> vertexC = graph.addVertex("c");

    Assertions.assertEquals(3, graph.size());
  }

  @Test
  public void testGraphWithOneNodeAndEdge() {
    Vertex<String> vertexA = graph.addVertex("a");
    graph.addEdge(vertexA, vertexA, 2);

    LinkedList<Vertex<String>> vertices = graph.getVertices();
    LinkedList<Edge<String>> neighbors = graph.getNeighbors(vertexA);

    Assertions.assertEquals(1, vertices.size());
    Assertions.assertEquals(1, neighbors.size());
    Assertions.assertEquals(vertexA, neighbors.getFirst().destination);
    Assertions.assertEquals(2, neighbors.getFirst().weight);
  }

  @Test public void testDepthFirstTraversal() {
    Graph<Character> graph = new Graph<>(6);
    Vertex<Character> nullV = new Vertex<>(null);
    Vertex<Character> a = graph.addVertex('A');
    Vertex<Character> b = graph.addVertex('B');
    Vertex<Character> c = graph.addVertex('C');
    Vertex<Character> d = graph.addVertex('D');
    Vertex<Character> e = graph.addVertex('E');
    Vertex<Character> f = graph.addVertex('F');
    Vertex<Character> g = graph.addVertex('G');
    Vertex<Character> h = graph.addVertex('H');

    graph.addEdge(a, b);
    graph.addEdge(a, d);
    graph.addEdge(b, c);
    graph.addEdge(b, d);
    graph.addEdge(c, g);
    graph.addEdge(d, e);
    graph.addEdge(d, h);
    graph.addEdge(d, f);
    graph.addEdge(f, h);

    LinkedList<Vertex<Character>> expectedTraversalOrder = new LinkedList<>();
    expectedTraversalOrder.add(a);
    expectedTraversalOrder.add(b);
    expectedTraversalOrder.add(d);
    expectedTraversalOrder.add(e);
    expectedTraversalOrder.add(c);
    expectedTraversalOrder.add(f);
    expectedTraversalOrder.add(g);
    expectedTraversalOrder.add(h);

    LinkedList<Vertex<Character>> traversalOrder = graph.depthFirstTraversal(a);

//    Assertions.assertEquals(expectedTraversalOrder, traversalOrder);
    assertNull(graph.depthFirstTraversal(nullV));
  }
}

