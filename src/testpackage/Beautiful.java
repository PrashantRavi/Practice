package testpackage;

import java.util.Scanner;

public class Beautiful {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String str = sc.nextLine();
			int count = 0;
			int num = 97;
			for (int j = 0; j < str.length(); j++) {
				
				if (num > 99) {
					num = 97;
				}
				if (num == str.charAt(j)) {
					num++;
				} else {
					count++;
					num++;
				}

			}
			System.out.println(count);

		}

	}

}
