package arrays;

public class Rotateby90 {

	public void printArr(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		double k=Math.ceil(((double) n) / 2);
		
		System.out.println("Value of k is "+k);
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Rotateby90 rot= new Rotateby90();
		int n=5;
		int [][]array=new int[n][n];
		 int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			array[i][j]=++count;	
			}
		}
		
		rot.printArr(array);
		rot.rotate(array);
	rot.printArr(array);	

	}

}
