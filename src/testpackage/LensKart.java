package testpackage;

import java.util.Scanner;
import java.util.TreeMap;

public class LensKart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int tc = 0; tc < N; tc++) {
			int num = sc.nextInt();
			arr[tc] = num;
			if (isPrime(num)) {
				map.put(tc, num);
			}
		}
		
		System.out.println(map);

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			//int s=map.get(i);
           if(map.get(i)!=null){
        	   System.out.print(arr[i]+ " ");
           }
           
           else{
        	   int min = Integer.MAX_VALUE;
   			int index = -1;
   			for (Integer key : map.keySet()) {
   				if (Math.abs(i - key) < min) {
   					min = Math.abs(i - key);
   					index = key;
   				}
   			}
   			if (index == -1) {
   				System.out.print("-1" + " ");
   			} else {
   				System.out.print(map.get(index) + " ");
   			}  
           }
			

		}

	}

	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		long sqrtN = (long) Math.sqrt(n) + 1;
		for (long i = 6L; i <= sqrtN; i += 6) {
			if (n % (i - 1) == 0 || n % (i + 1) == 0)
				return false;
		}
		return true;
	}

}
