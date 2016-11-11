package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class test {

	 public static void main(String args[]) {
		 String a="bbc";
		 System.out.println(score(a));
		 
	 }
	 
	 
	public  static int score(String s) {
//What the Hell
		 boolean array[]= new boolean[150];
		 
		 int score =0;
		         for(int i=0;i<s.length();i++){
		        	 if(array[(int)s.charAt(i)]==true){
		        		 continue;
		        	 }
		             if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='e'||s.charAt(i)=='u'){
		                 score+=1;
		                 array[(int)s.charAt(i)]=true;
		             }
		             else{
		                 score+=2;
		                 array[(int)s.charAt(i)]=true;
		             }
		         }
		         return score;

		     }
}
