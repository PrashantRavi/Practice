package testpackage;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=0;tc<T;tc++){
			int n =sc.nextInt();
			int level=0;
			int array[]=new int[100];
			String str= sc.next();
			for(int i=0;i<str.length()-1;i++){
				if(str.charAt(i)=='('){
					if(str.charAt(i+1)!='('&&str.charAt(i+1)!=')'){
						array[level]+=Character.getNumericValue(str.charAt(i+1));
						level++;
						i++;	
					}
					else if(str.charAt(i+1)==')'){	
					i++;	
					}

				}
				else{
					level--;	
			}
			
		}
			System.out.println("#"+(tc+1)+" "+array[n]);

	}

}
}
