package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TidyNumber {

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(new File("input.txt"));
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			System.out.println("Case #"+i+": "+ solve(sc.nextLong()));
		}

	}
	
	public static long solve (long n)throws Exception{
		
		for(long i=n;i>=1;i--){
			long temp=i;
			int x=9;
			while(temp>0){
				int t=(int) (temp%10);
				if(t>x){
					break;
				}
				x=t;
				temp=temp/10;
			}
			if(temp==0){
				return i;
				
			}
		}
		return 0;
	}

}
