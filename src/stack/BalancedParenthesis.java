package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++){
			int count=0;
			Stack<Character> stk=new Stack<Character>();
			String str=sc.nextLine();
			if(str.equals(""))
			{
			    	System.out.println("YES");
			    	continue;
			}
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)=='('){
					stk.push(str.charAt(j));
				}
				else{
					if(stk.isEmpty()){
						count++;
						continue;
					}
					stk.pop();
				}
			}
			
			if(stk.size()==1||count==1){
				System.out.println("Yes");
			}
			else
			{
				System.out.println("NO");
			}
			System.out.println(stk.size());
		}
		sc.close();

	}

}
