package arrays;

public class NoOfIsland {
	
	
	//  DFS ...
	
	public int numofIslands(char[][] grid) {
	    if(grid==null || grid.length==0||grid[0].length==0)
	        return 0;
	 
	    int m = grid.length;
	    int n = grid[0].length;
	 
	    int count=0;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(grid[i][j]=='1'){
	                count++;
	                merge(grid, i, j);
	            }
	        }
	    }
	 
	    return count;
	}
	 
	public void merge(char[][] grid, int i, int j){
	    int m=grid.length;
	    int n=grid[0].length;
	 
	    if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')
	        return;
	 
	    grid[i][j]='X';
	 
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	}
	
	
	
	
	//   Unioun-Find Method

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;

		int m = grid.length;
		int n = grid[0].length;

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		int[] root = new int[m * n];

		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					root[i * n + j] = i * n + j;
					count++;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					for (int k = 0; k < 4; k++) {
						int x = i + dx[k];
						int y = j + dy[k];

						if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
							int cRoot = getRoot(root, i * n + j);
							int nRoot = getRoot(root, x * n + y);
							if (nRoot != cRoot) {
								root[cRoot] = nRoot; // update previous node's
														// root to be current
								count--;
							}

						}
					}
				}
			}
		}

		return count;
	}

	public int getRoot(int[] arr, int i) {
		while (arr[i] != i) {
			i = arr[arr[i]];
		}

		return i;
	}
	
	public void printArray(int[][]arr){
	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
    NoOfIsland nf = new NoOfIsland();
   
    char arr[][]= {{1,1,1,1,0},{1,1,0,0,0},{1,1,0,1,0},{0,0,0,0,0}};
     System.out.println(nf.numofIslands(arr));
		//nf.printArray(arr);
		
	}

}
