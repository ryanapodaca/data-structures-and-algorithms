package codechallenges.graph;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestGraphBreadthTraversal {

  @Test
  public void testGetGraphValues() {
    // Create a graph
    Graph<String> graph = new Graph<>(6);
    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v2 = graph.addVertex("Arendelle");
    Vertex<String> v3 = graph.addVertex("Metroville");
    Vertex<String> v4 = graph.addVertex("Monstroplis");
    Vertex<String> v5 = graph.addVertex("Narnia");
    Vertex<String> v6 = graph.addVertex("Naboo");

    graph.addEdge(v1, v2);
    graph.addEdge(v2, v3);
    graph.addEdge(v2, v4);
    graph.addEdge(v3, v4);
    graph.addEdge(v3, v5);
    graph.addEdge(v3, v6);
    graph.addEdge(v4, v6);
    graph.addEdge(v5, v6);

    // Perform breadth-first traversal
    List<String> expected = Arrays.asList("Arendelle", "Metroville", "Monstropolis", "Narnia", "Naboo");
    List<String> actual = BreadthTraversal.getGraphValues(graph);

    // Assert the expected and actual results
    assertEquals(expected, actual);
  }

  @Test public void testGetGraphValues_NullGraph() {
    // Perform breadth-first traversal on a null graph
    Graph<String> graph = null;
    ArrayList<String> result = BreadthTraversal.getGraphValues(graph);

    // Assert that the result is null
    assertNull(result);
  }
}

