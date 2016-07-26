package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Topological_Sorting {

	private int V;
	private LinkedList<Integer> adj[];

	public Topological_Sorting(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}

	}

	public void addEdge(int u, int v) {
		adj[u].add(v);
	}

	public void topologicalSort() {
		Stack stack = new Stack();
		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				topologicalUtil(i, stack, visited);
			}
		}

		while (stack.empty()==false) {
			System.out.println(stack.pop() + " ");
		}

	}

	public void topologicalUtil(int v, Stack stack, boolean visited[]) {

		visited[v] = true;
		Integer i;
		Iterator<Integer> it = adj[v].listIterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i]) {
				topologicalUtil(i, stack, visited);
			}
		}

		stack.push(new Integer(v));

	}

	public static void main(String[] args) {
		Topological_Sorting g = new Topological_Sorting(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
	}

}
