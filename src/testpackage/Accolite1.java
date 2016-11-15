package testpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Accolite1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		int Sum=0;
		int MSum=0;
		
		int arr[]= new int [N];
		int marr[]=new int[M];
		
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<M;i++){
			marr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		Arrays.sort(marr);
		
		for(int i=0;i<N;i++){
			int count=0;
			for(int j=0;j<M;j++){
				if(arr[i]>marr[j]){
					
				}else{
					count=j;
					break;
				}
			}
			Sum+=count*M-count;
			
		}
		
		for(int i=0;i<M;i++){
			int count=0;
			for(int j=0;j<N;j++){
				if(marr[i]>arr[j]){
					
				}else{
					count=j;
					break;
				}
			}
			MSum+=count*M-count;
			
		}
		
		if(MSum>Sum){
			System.out.println("!Monk "+(MSum-Sum));
		}else if(MSum<Sum){
			System.out.println("Monk "+(Sum-MSum));
		}else{
			System.out.println("Tie");
		}
		

	}

}
