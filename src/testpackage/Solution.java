package testpackage;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(val("re"));
	
		
	}
	
	public static boolean val(String str){
		try {
			int a= Integer.parseInt(str);
			System.out.println(a);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

}
