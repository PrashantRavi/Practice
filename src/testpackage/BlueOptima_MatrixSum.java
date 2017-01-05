package testpackage;

import java.util.Scanner;

public class BlueOptima_MatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=0;tc<T;tc++){
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(i==j){
						sum++;
					}else{
						sum+=i/j;
					}
				}
			}
			System.out.println(sum);
		}
		sc.close();

	}

}
