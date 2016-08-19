package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CloneGraph {
   
	int label ;
	ArrayList <CloneGraph> neighbour ;
	
	CloneGraph(int x){
		label=x;
		neighbour = new ArrayList<CloneGraph>();
	}
	
	void addEdge(CloneGraph v, CloneGraph w)  { v.neighbour.add(w); w.neighbour.add(v);}
	
	
	public CloneGraph cloneGraph(CloneGraph node) {
        if(node == null)
            return null;
 
        LinkedList<CloneGraph> queue = new LinkedList<CloneGraph>();
        HashMap<CloneGraph, CloneGraph> map = 
                                   new HashMap<CloneGraph,CloneGraph>();
 
        CloneGraph newHead = new CloneGraph(node.label);
 
        queue.add(node);
        map.put(node, newHead);
 
        while(!queue.isEmpty()){
            CloneGraph curr = queue.pop();
            ArrayList<CloneGraph> currNeighbors = curr.neighbour; 
 
            for(CloneGraph aNeighbor: currNeighbors){
                if(!map.containsKey(aNeighbor)){
                    CloneGraph copy = new CloneGraph(aNeighbor.label);
                    map.put(aNeighbor,copy);
                    map.get(curr).neighbour.add(copy);
                    queue.add(aNeighbor);
                }else{
                    map.get(curr).neighbour.add(map.get(aNeighbor));
                }
            }
 
        }
        return newHead;
    }
	
	
	
	public static void main(String[] args) {
		CloneGraph cg= new CloneGraph(0);	
		

	}

}
