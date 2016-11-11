package testpackage;

import java.util.Scanner;

public class TAPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			float CRS = sc.nextFloat();
			//int ORR[] = new int[2];
			//ORR[0] = sc.nextInt();
			//int osp = sc.nextInt();
			
			float OS = sc.nextFloat();
			if (OS == 0) {
				System.out.println(CRS*.75);
			}

			

			if (CRS*.75< OS) {
				System.out.println(OS/.98);
			} else {
				if ((CRS*.75)< OS/.9) {
					System.out.println(CRS*.75);
				} else {
					System.out.println(OS/.9);
				}
			}

		}

	}

}
