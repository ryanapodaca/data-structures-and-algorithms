package codechallenges.graph;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestBusinessTrip {

  @Test public void testBusinessTrip() {
    // Create a graph
    Graph<String> graph = new Graph<>(6);
    Graph<String> graph2 = new Graph<>(6);

    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v2 = graph.addVertex("Arendelle");
    Vertex<String> v3 = graph.addVertex("Metroville");
    Vertex<String> v4 = graph.addVertex("Monstropolis");
    Vertex<String> v5 = graph.addVertex("Narnia");
    Vertex<String> v6 = graph.addVertex("Naboo");

    graph.addEdge(v1, v2, 150);
    graph.addEdge(v2, v3,99);
    graph.addEdge(v2, v4,42);
    graph.addEdge(v3, v4,105);
    graph.addEdge(v3, v5,37);
    graph.addEdge(v3, v6,26);
    graph.addEdge(v4, v6,73);
    graph.addEdge(v5, v6,250);


    String expected = "$73";
    String start = "Monstropolis";
    String end = "Naboo";
    String actual = BusinessTrip.businessTrip(graph,start,end);

    String end2 = "Pandora";

    assertEquals(expected, actual);
    //Null cases
    assertNull(BusinessTrip.businessTrip(graph,start,end2));
    assertNull(BusinessTrip.businessTrip(graph2,start,end2));
  }
}
