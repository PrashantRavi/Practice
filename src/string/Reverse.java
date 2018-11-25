package string;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter String   ");
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		char[]a =s.toCharArray();
		new Reverse().reverseWords(a);
		System.out.println(a);
		

	}
	
	public void reverseWords(char a[]){
		int i=0;
		for(int j=0;j<a.length-1;j++){
			if(a[j]==' '){
				reverse(a,i,j-1);
				i=j+1;
			}
		}
		System.out.println(a);
		reverse(a,i,a.length-1);
		reverse(a, 0, a.length-1);
		
		
	}
	
	public void reverse(char[]a,int i,int j){
		if(a==null||a.length==0) return;
		
		while(i<j){
			char t= a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
		
	}

}
