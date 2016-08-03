package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amazon2 {

	public static int len(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());

			int length = len(N);
			int T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				String a=br.readLine();
				String arr[]=a.split(" ");
				int l = Integer.parseInt(arr[0]);
				int h = Integer.parseInt(arr[1]);
				if (l <= 0 || h <= 0 || l > h || l > length || h > length) {
					System.out.println("NO");
				} else {
					if ((int) ((int) (N % Math.pow(10, length + 1 - l)) / Math.pow(10, length - h)) % 7 == 0) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
