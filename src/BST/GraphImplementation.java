package BST;

import java.util.LinkedList;

class Graph
{
	LinkedList<Integer> adjacentVerticesList[];
	int numberOfVertices;

	Graph(int numberOfVertices)
	{
		this.numberOfVertices = numberOfVertices;

		adjacentVerticesList = new LinkedList[numberOfVertices];

		for (int i = 0; i < numberOfVertices; i++) {
			adjacentVerticesList[i] = new LinkedList<>();
		}
	}

	public void addEdge(Graph g, int source, int destination)
	{
		g.adjacentVerticesList[source].addFirst(destination);

		// Undirected
		g.adjacentVerticesList[destination].addFirst(source);
	}

	public void printGraph(Graph g)
	{
		for (int v = 0; v < g.numberOfVertices; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : g.adjacentVerticesList[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}
}

public class GraphImplementation
{
	public static void main(String args[])
	{
		Graph g = new Graph(5);
		g.addEdge(g, 0, 1);
		g.addEdge(g, 0, 4);
		g.addEdge(g, 1, 2);
		g.addEdge(g, 1, 3);
		g.addEdge(g, 1, 4);
		g.addEdge(g, 2, 3);
		g.addEdge(g, 3, 4);
		g.printGraph(g);
	}
}
