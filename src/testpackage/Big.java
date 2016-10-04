package testpackage;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		BigInteger a=new BigInteger(n);
		/*String result ="";
		BigInteger b1= a.add(new BigInteger("1"));
		BigInteger b2=a.multiply(b1);*/
		BigInteger b3=a.multiply(a.add(new BigInteger("1"))).divide(new BigInteger("2"));
		System.out.println(b3);
		

	}

}
