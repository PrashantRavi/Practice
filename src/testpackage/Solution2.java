package testpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution2 {

	public static void main(String[] args) {
		int arr [] = {3 ,3 , 3 , 2 ,2 ,4 ,4 ,4 ,4 };
		
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
		   
			if(map.get(arr[i])==null){
				map.put(arr[i],1);
			}
			else{
				int t= map.get(arr[i]);
				map.put(arr[i],t+1);
			}
		}
	}

}
