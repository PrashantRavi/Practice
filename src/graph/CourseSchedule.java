package graph;

import java.util.LinkedList;

public class CourseSchedule {
	
	public int[] canFinish(int numCourses, int[][] prerequisites) {
	    if(prerequisites == null){
	        throw new IllegalArgumentException("illegal prerequisites array");
	    }
	 
	    int len = prerequisites.length;
	 
	    if(len == 0){
	        int[] res = new int[numCourses];
	        for(int m=0; m<numCourses; m++){
	            res[m]=m;
	        }
	        return res;
	    }
	 
	    // counter for number of prerequisites
	    int[] pCounter = new int[numCourses];
	    for(int i=0; i<len; i++){
	        pCounter[prerequisites[i][0]]++;
	    }
	 
	    //store courses that have no prerequisites
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    for(int i=0; i<numCourses; i++){
	        if(pCounter[i]==0){
	            queue.add(i);
	        }
	    }
	 
	    // number of courses that have no prerequisites
	    int numNoPre = queue.size();
	    int[] result = new int[numCourses];
	    int j=0;
	 
	    while(!queue.isEmpty()){
	        int top = queue.remove();
	        result[j++]=top;
	        for(int i=0; i<len; i++){
	            // if a course's prerequisite can be satisfied by a course in queue
	            if(prerequisites[i][1]==top){
	                pCounter[prerequisites[i][0]]--;
	                if(pCounter[prerequisites[i][0]]==0){
	                    numNoPre++;
	                    queue.add(prerequisites[i][0]);
	                }
	            }
	        }
	    }
	 
	    //return numNoPre == numCourses;
	    if(numNoPre==numCourses){
	        return result;
	    }else{
	        return new int[0];
	    }
	}

	public static void main(String[] args) {
	
		CourseSchedule cs = new CourseSchedule();
		int numCourses=5;
		int [][] array={{0,1},{1,2},{4,3},{2,4}};
		
		int arr[]=cs.canFinish(numCourses, array);
		
		for(int i:arr){
			System.out.print(i+" ");
		}
		
	}

}
