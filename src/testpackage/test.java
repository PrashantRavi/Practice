package testpackage;

import java.util.Scanner;

public class test {


	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=0;tc<T;tc++){
			int N =sc.nextInt();
			int arr[]=new int[N];
			
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
			}
			
		System.out.println(findMaxDiff(arr,N));	
			
		}

	}
	
	public static int findMaxDiff(int a[], int n){
		int maxdiff=0;
		for(int i=0;i<n;i++){
		
			int L=0;
			int R=0;
			
       
			if(i==0){
				L=0;
			}
			else{
				for(int j=i;j>=0;j--){
					if(a[i]>a[j]){
						L=a[j];
						break;
					}
				}
			}
			
			
			if(i==n-1){
				R=0;
			}
			else{
				for(int j=i+1;j<n;j++){
					if(a[i]>a[j]){
						R=a[j];
						break;
					}
				}
			}
			
			
			
			if(Math.abs(L-R)>maxdiff){
				maxdiff=Math.abs(L-R);
			}
			
		}
		return maxdiff;
	}
	
	

}
