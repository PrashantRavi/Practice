package testpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {


public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=0;tc<T;tc++){
			int n=sc.nextInt();
			int sum=0;
			
			for(int i=1;i<=n;i++){
				int j;
				for(j=1;j<=i/(n/2);j++){
					sum=sum+i/j;
				}
				sum=sum+i-j+1;
			}
			
			System.out.println(sum);
		}
		
		
	}

}


