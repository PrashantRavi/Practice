package testpackage;

import java.util.Scanner;

public class StringRev {
	
	public static int fact(int n){
	       if(n==1)
	       return 1;
	       else
	       return n*fact(n-1);
	       
	   }

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in); 
		String text= sc.nextLine();
		String test=sc.nextLine();
		
		if(text.length()!=test.length()){
			System.out.println("String is not same");
		}
		int index=-1;
		for(int i=0;i<test.length();i++){
			if(test.charAt(i)==text.charAt(0)){
				index=i;
				break;
			}
		}
		
		int i=index;
		int j=0;
		for(;j<text.length();i++,j++){
			
			if(i>test.length()-1){
				i=0;
			}
			if(test.charAt(i)==text.charAt(j)){
				
			}
			else{
				System.out.println("String is not same");
				break;
			}
				
		}
		if(j==text.length())
		System.out.println("String is  same");*/
		
		System.out.println(fact(5));

	}

}
