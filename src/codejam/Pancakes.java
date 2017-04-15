package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pancakes {

	public static void main(String[] args) throws Exception {
		/*Scanner sc =new Scanner(new File("input.txt"));
    int N =sc.nextInt();
    for(int i=0;i<N;i++){
    	String cake=sc.next();
    	int t=sc.nextInt();
    	System.out.println(cake);
    }*/
    
    solve("---+-++-");

	}
	
	static void solve(String s) throws Exception {
		
		int ans = 0;
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != (i + 1 == s.length() ? '+' : s.charAt(i + 1))) {
				++ans;
			}
			else{
				if(count==3){
					ans++;
					count=0;
				}
				count++;
			}
		}
		System.out.println(ans);
	}


}
