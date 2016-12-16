package testpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		
		int I=Integer.parseInt(sc.nextLine());
		int J=Integer.parseInt(sc.nextLine());
		String strarr[]=str.split(",");
		ArrayList<String>result=new ArrayList<String>();
		
		for(int k=0;k<strarr.length;){
			int i=I;
			while(i>0){
				result.add(strarr[k]);
				i--;
				k++;
			}
			int j=J;
			while(j>0){
				j--;
				k++;
			}
		}
		
		System.out.print(result.get(0));
		for(int i=1;i<result.size();i++){
			System.out.print(","+result.get(i));
		}
		sc.close();
		
	}

}


