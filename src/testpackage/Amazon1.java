package testpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList arrr = new ArrayList();
		int count = 0;

		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			count++;
			for (int j = 0; j < temp; j++)
				arrr.add(count);
		}

		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			System.out.println(arrr.get(sc.nextInt() - 1));
		}

	}

}
