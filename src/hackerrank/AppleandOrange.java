package hackerrank;

import java.util.Scanner;

public class AppleandOrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple =0;
		int orange =0;
			int s = sc.nextInt();
			int t=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int m=sc.nextInt();
			int n=sc.nextInt();
			
			for(int i=0;i<m;i++){
				int temp=sc.nextInt();
				if(temp>=s-a&&temp<=t){
					apple++;
				}
			}
			for(int i=0;i<n;i++){
				int temp=b+sc.nextInt();
				if(temp>=s&&temp<=t){
					orange++;
				}
			}
			System.out.println(apple+"\n"+orange);

	}

}
