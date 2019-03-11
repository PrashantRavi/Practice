package arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int arr[] = {10, 5, 10};
		int max =0;
		int secondmax=0;
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>secondmax){
				secondmax=arr[i];
				
			}
			if(arr[i]>max){
				secondmax= max;
				max =arr[i];
			}
		}
		
		System.out.println(secondmax);

	}

}
