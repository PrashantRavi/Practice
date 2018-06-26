package testpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class PrintAllKLengthStrings {

	public static int count;

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int N= sc.nextInt();
		int M= sc.nextInt();
		int K= sc.nextInt();
		
		
		for(int ca=0;ca<N;ca++){
			int L= sc.nextInt();
			int R= sc.nextInt();
			int Z= sc.nextInt();
			data1.add(new Data(L, R, Z));
		}
		
		int ij = 1;
		for (int i = 1; i <= M; i++) {
			hashSet.clear();
			for (Data d : data1) {
				if (d.i <= i && d.k >= i) {
					hashSet.add(d.index);
				}
			}
			ij = ij * (K - hashSet.size());
		}
       int m =1000003;
		System.out.println(ij)	;

	}

	public static HashSet hashSet = new HashSet();
	public static ArrayList<Data> data1 = new ArrayList();

	public static class Data {

		Data(int i, int k, int index) {
			this.i = i;
			this.index = index;
			this.k = k;
		}

		int i;
		int k;
		int index;
	}

}