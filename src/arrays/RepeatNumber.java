package arrays;

public class RepeatNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5,4};

		int sum = arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			sum = sum^arr[i];
		}
		System.out.println(sum);
	}

}
