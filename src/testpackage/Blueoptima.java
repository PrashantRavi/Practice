package testpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Blueoptima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(largestNumber(arr));
	}

	public static String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}

		while (sb.charAt(0) == '0' && sb.length() > 1)
			sb.deleteCharAt(0);

		return sb.toString();
	}

}
