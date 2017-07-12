package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFact {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		
		BigInteger sum=new BigInteger("1");
		while(num>0){
			sum=sum.multiply(BigInteger.valueOf(num));
			num--;
		}
		System.out.println(sum);

	}

}
