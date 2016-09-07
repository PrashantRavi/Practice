package testpackage;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		
		System.out.println(find(15));
		
	}
	
	public static int find(int N){
		int num=N;
		 int count =0;
		while (num >1){
		num=num/2;
		count++;
		}
		return count-1;
	}

}
