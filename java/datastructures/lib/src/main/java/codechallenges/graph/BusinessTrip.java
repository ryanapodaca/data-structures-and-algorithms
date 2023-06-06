package codechallenges.graph;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import java.util.LinkedList;

public class BusinessTrip {
  public static String businessTrip(Graph flightMap, String start, String end ) {
    if (flightMap == null || start == null || end == null)
      return null;

    LinkedList<Vertex<String>> vertices = flightMap.getVertices();

    Vertex<String> verifiedStart = null;

    for(Vertex<String> vertex : vertices) {
      if(vertex.value.equals(start)){
        verifiedStart = vertex;
        break;
      }
    }

    if (verifiedStart == null)
      return null;

    LinkedList<Edge<String>> destinations = flightMap.getNeighbors(verifiedStart);

    for(Edge<String> edge : destinations) {
      if (edge.destination.value.equals(end))
        return  "$" + edge.weight;
    }

    return null;
  }
}
