package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DNASequence {

	public static void main(String[] args) {
		DNASequence ds =new DNASequence();
		String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> list = new ArrayList<String>();
		list=ds.findRepeatedDnaSequences(s);
		System.out.println(list);

	}
	
	public List<String> findRepeatedDnaSequences(String s) {  
	     List<String> res=new ArrayList<String>();  
	     if(s==null || s.length()<10) return res;  
	     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();  
	     int hashCode=0;  
	     int base=1;  
	     for(int i=0;i<10;i++){  
	       hashCode+=getCode(s.charAt(i))*base;  
	       base*=5;  
	       System.out.println(i+"\t"+base+"\t"+hashCode+"\t"+s.charAt(i));
	     }  
	    map.put(hashCode,1);  
	    base=base/5;  
	    for(int i=10;i<s.length();i++){  
	      hashCode=hashCode/5+getCode(s.charAt(i))*base;  
	      if(!map.containsKey(hashCode)) map.put(hashCode,1);  
	      else{  
	        if(map.get(hashCode)==1) {  
	          res.add(s.substring(i-9,i+1));  
	          map.put(hashCode,2);  
	        }  
	      }
	      
	      System.out.println(i+"\t"+base+"\t"+hashCode+"\t"+s.charAt(i));
	    }  
	    return res;  
	   }  
	   public int getCode(char c){  
	     switch (c){  
	     case 'A': return 1;  
	     case 'C': return 2;  
	     case 'G': return 3;  
	     case 'T': return 4;  
	     default: return 0;  
	     }  
	   }

}
