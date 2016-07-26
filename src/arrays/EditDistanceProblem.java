package arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class EditDistanceProblem {
	
	public int recursive(String s1,String s2,int m,int n){
	
		if(m==0){return n;}
		
		if(n==0){ return m;}
		 
		if(s1.charAt(m-1)==s2.charAt(n-1)){
			recursive(s1,s2,m-1,n-1);
		}
		
		//If nothing above worked then we need to try all 3 operations
        //and choose the minimum among them
        return 1 + Math.min(recursive(s1, s2, m, n-1), //Insert
                Math.min(recursive(s1, s2, m-1, n), // Remove
recursive(s1, s2, m-1, n-1))); //Replace
		
	}

	public static void main(String[] args) {
		String s1 ="hoizon";
		String s2="horizontal";
		EditDistanceProblem d1 = new EditDistanceProblem();
		System.out.println(d1.recursive(s1, s2, s1.length(),s2.length()));
		
	}

}
