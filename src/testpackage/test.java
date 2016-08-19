package testpackage;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		boolean [] arr=new boolean[10];
		int j=2;
		for(int i=j;i<arr.length;i=i+j){
			arr[i]=true;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(i+"   "+arr[i]);
		}
		
	}

}
