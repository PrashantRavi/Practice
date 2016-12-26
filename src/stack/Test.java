package stack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++){
			int count=0;
			String str=sc.nextLine();
			if(str.equals(""))
			{
			    	System.out.println("YES");
			    	continue;
			}
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)=='('){
					count++;
				}
				else
					count--;
			}
			
			if(count==-1||count==1){
				System.out.println("Yes");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}
