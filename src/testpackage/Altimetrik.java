package testpackage;

import java.util.Scanner;

public class Altimetrik {

	public static boolean fxn(int N) {
		int count=1;
		for(int i=2;i<N/2;i++){
			if(Math.pow(i, count)==N){
				return true;
			}
			else if(Math.pow(i, count)<N){
				count++;
			}
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {

			int Q = sc.nextInt();
			for (int i = 0; i < Q; i++) {
				int N = sc.nextInt();

				for (int j = N; j > 0; j--) {
               if(fxn(j)==true){
            	System.out.println(N-j);
            	break;
               }
					
				}
			}
		}

	}

}
