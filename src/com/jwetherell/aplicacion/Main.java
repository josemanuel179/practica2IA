package aplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jwetherell.algorithms.graph.*;
import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.TYPE;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;


public class Main {
  public static class Grafo {
    final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
    final Graph.Vertex<Integer> n1 = new Graph.Vertex<Integer>(1);
    final Graph.Vertex<Integer> n2 = new Graph.Vertex<Integer>(2);
    final Graph.Vertex<Integer> n3 = new Graph.Vertex<Integer>(3);
    final Graph.Vertex<Integer> n4 = new Graph.Vertex<Integer>(4);
    final Graph.Vertex<Integer> n5 = new Graph.Vertex<Integer>(5);
    final Graph.Vertex<Integer> n6 = new Graph.Vertex<Integer>(6);
    final Graph.Vertex<Integer> n7 = new Graph.Vertex<Integer>(7);
    final Graph.Vertex<Integer> n8 = new Graph.Vertex<Integer>(8);
    final Graph.Vertex<Integer> n9 = new Graph.Vertex<Integer>(9);
    final Graph.Vertex<Integer> n10 = new Graph.Vertex<Integer>(10);
    {
      verticies.add(n1);
      verticies.add(n2);
      verticies.add(n3);
      verticies.add(n4);
      verticies.add(n5);
      verticies.add(n6);
      verticies.add(n7);
      verticies.add(n8);
      verticies.add(n9);
      verticies.add(n10);
    }

    final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
    final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(6, n1, n2);
    final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(10, n1, n3);
    final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(7, n1, n4);
    final Graph.Edge<Integer> e2_5 = new Graph.Edge<Integer>(11, n2, n5);
    final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(2, n3, n4);
    final Graph.Edge<Integer> e3_5 = new Graph.Edge<Integer>(9, n3, n5);
    final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(5, n3, n6);
    final Graph.Edge<Integer> e4_3 = new Graph.Edge<Integer>(2, n4, n3);
    final Graph.Edge<Integer> e4_7 = new Graph.Edge<Integer>(5, n4, n7);
    final Graph.Edge<Integer> e5_8 = new Graph.Edge<Integer>(4, n5, n8);
    final Graph.Edge<Integer> e6_9 = new Graph.Edge<Integer>(7, n6, n9);
    final Graph.Edge<Integer> e7_10 = new Graph.Edge<Integer>(4, n7, n10);
    final Graph.Edge<Integer> e9_10 = new Graph.Edge<Integer>(2, n9, n10);
    final Graph.Edge<Integer> e10_9 = new Graph.Edge<Integer>(2, n10, n9);
    {
      edges.add(e1_2);
      edges.add(e1_3);
      edges.add(e1_4);
      edges.add(e2_5);
      edges.add(e3_4);
      edges.add(e3_5);
      edges.add(e3_6);
      edges.add(e4_3);
      edges.add(e4_7);
      edges.add(e5_8);
      edges.add(e6_9);
      edges.add(e7_10);
      edges.add(e9_10);
      edges.add(e10_9);
    }

    final Graph<Integer> graph = new Graph<Integer>(verticies, edges);
  }

  public static void main(String[] args) {
  	final Grafo grafo = new Grafo();
    final Graph.Vertex<Integer> start = grafo.n1;
    final Graph.Vertex<Integer> end = grafo.n9;
    {
  	  final AStar<Integer> aStar = new AStar<Integer>();
      final List<Graph.Edge<Integer>> path = aStar.aStar(grafo.graph, start, end);
      System.out.println("A* path error. path="+path);
  	}
  }
}
