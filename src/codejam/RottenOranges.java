/*PS --

Given a matrix of dimension r*c where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:

0: Empty cell
1: Cells have fresh oranges
2: Cells have rotten oranges 

So we have to determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. If it is impossible to rot every orange then simply return -1.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains two integers r and c, where r is the number of rows and c is the number of columns in the array a[]. Next r line contains space separated c elements each in the array a[].

Output:
Print an integer which denotes the minimum time taken to rot all the oranges.(-1 if it is impossible).

Constraints:
1<=T<=100
1<=r<=100
1<=c<=100
0<=a[i]<=2

Example:
Input:
2
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
3 5
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1

Output:
2
-1
*/

package codejam;

import java.util.Scanner;

public class RottenOranges {

	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=0;tc<T;tc++){
				int r =sc.nextInt();
				int c=sc.nextInt();
				count =0;
				int arr[][] =new int[r+1][c+1];
				boolean visiter[][]=new boolean[r+1][c+1];
				for(int i=0;i<r;i++){
					for(int j=0;j<c;j++){
					arr[i][j]=sc.nextInt();	
					}
				}
				
				for(int i=0;i<r;i++){
					
				}
				
				for(int i=0;i<r;i++){
					for(int j=0;j<c;j++){
						if(arr[i][j]==2){
							
							dfs(arr,i,j,visiter,r,c);
						}
					}
				}
				
			System.out.println(count);	
		}

	}
	
	public static void dfs(int arr[][],int i,int j,boolean visiter[][],int r,int c){
		visiter[i][j]=true;
		if((i-1>=0&&i<r)&&(j>=0&&j<c)&&!visiter[i-1][j]&&arr[i-1][j]==1){
			arr[i-1][j]=2;
			dfs(arr,i-1,j,visiter,r,c);
			count++;
		}
		
		if((i>=0&&i<r)&&(j>=0&&j<c)&&!visiter[i+1][j]&&arr[i+1][j]==1){
			arr[i+1][j]=2;
			dfs(arr,i+1,j,visiter,r,c);
			count++;
		}
		
		if((i>=0&&i<r)&&(j>=0&&j<c)&&!visiter[i][j-1]&&arr[i][j-1]==1){
			arr[i][j-1]=2;
			dfs(arr,i,j-1,visiter,r,c);
			count++;
		}
		
		if((i>=0&&i<r)&&(j>=0&&j<c)&&!visiter[i][j+1]&&arr[i][j+1]==1){
			arr[i][j+1]=2;
			dfs(arr,i,j+1,visiter,r,c);
			count++;
		}
		
	}

}
