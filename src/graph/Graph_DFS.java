package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_DFS {

	private int V;
	private LinkedList<Integer> adj[];
	
	Graph_DFS(int v){
		V=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	
	public void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	public void DFS(){
		boolean visited[]= new boolean[V];
		for (int i=0; i<V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
	}
	
	public void DFSUtil(int v,boolean visited[]){
		visited[v]=true;
		System.out.print(v+" ");
		
		Iterator<Integer> i=adj[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n]){
				DFSUtil(n,visited);
			}
				
			
			
		}
	}
	
	public static void main(String[] args) {
		Graph_DFS g = new Graph_DFS(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS();

	}

}