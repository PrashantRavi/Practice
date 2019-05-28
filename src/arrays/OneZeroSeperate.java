package arrays;

import java.util.Scanner;

public class OneZeroSeperate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int i=0,j=n-1;
		while(i<j){
			while(true){
				if(arr[i]==1){
					break;
				}
				++i;
			}
			
			while(true){
				if(arr[j]==0){
					break;
				}
				--j;
			}
			
			if(i<j)
			{
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		
		for(int k=0;k<n;k++){
			System.out.println(arr[k]);
		}
		
	}
	
}
