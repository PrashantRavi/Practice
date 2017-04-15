package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int arr[]=new int[str.length()];
		arr[0]=(int)str.charAt(0)-96;
		
		for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
            	arr[i]=arr[i-1]+(int)str.charAt(i)-96;
            }else{
            	arr[i]=(int)str.charAt(i)-96;
            }
		}
		
		int N=sc.nextInt();
		int check=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==N){
				System.out.println("Yes");
				check=1;
				break;
			}
		}
		if(check==0)
			System.out.println("No");
		

	}

}
