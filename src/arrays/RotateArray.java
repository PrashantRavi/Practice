package arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int k=3;
		printArray(arr);
		rotateBubble(arr, k);
		System.out.println();
      printArray(arr);		

	}
	
	public static void rotateBubble(int arr[],int n){
		if(arr==null||n<0){
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		for(int i=0;i<n;i++){
			for(int j=arr.length-1;j>0;j--){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
	
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
