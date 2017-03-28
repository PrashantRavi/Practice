package testpackage;

import java.util.Scanner;

public class HoneyWell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for (int n = 1; n <= N; n++) {
			arr[n] = sc.nextInt();
		}

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int h = sc.nextInt();
			for (int j = l; j <= h; j++) {
				if (arr[j] != arr[N - j + 1]) {
					arr[j] = arr[j] ^ arr[N - j + 1];
					arr[N - j + 1] = arr[j] ^ arr[N - j + 1];
					arr[j] = arr[j] ^ arr[N - j + 1];
				}

			}

		}

		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
