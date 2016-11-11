package testpackage;

import java.util.Scanner;

public class Amazon_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= Integer.parseInt(sc.nextLine());
		String food=sc.nextLine();
		String sleep=sc.nextLine();
		int Q=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<Q;i++){
			int L =sc.nextInt()-1;
			int H=sc.nextInt()-1;
			String tmfood="";
			String tmsleep="";
			int array[][]=new int[26][2];
			for(int j=L;j<=H;j++){
				tmfood+=food.charAt(j);
				tmsleep+=sleep.charAt(j);
			}
			for(int j=0;j<H-L+1;j++){
			if(tmsleep.charAt(j)=='0'){
				array[(int)tmfood.charAt(j)-97][0]+=1;
			}
			else{
				array[(int)tmfood.charAt(j)-97][1]+=1;
			}
			}
			int sumZero=0;
			int sumOne=0;
			int total=0;
			for(int k=0;k<26;k++){
				sumZero+=array[k][0];
				sumOne+=array[k][1];
				total+=(cal(array[k][0]+array[k][1])-cal(array[k][0])-cal(array[k][0]));
				
			}
			total+=(cal(sumZero)+cal(sumOne));
			int M=10^9+7;
			System.out.println(total%M);
			
		}

	}
	
	public static int cal(int n){
		if(n<=1){
			return 0;
		}
		else{
			return(n*n-1)/2;
		}
	}

}
