package dp;

public class MinimumInsertion {

	public static void main(String[] args) {
		System.out.println(findMinInsertionsDP(5,"geeks"));

	}
	
	public static int min(int a, int b)
	{   return a < b ? a : b;  }
	 
	// A DP function to find minimum number of insersions
	public static int findMinInsertionsDP(int n,String str)
	{
	    // Create a table of size n*n. table[i][j] will store
	    // minumum number of insertions needed to convert str[i..j]
	    // to a palindrome.
	    int l, h, gap;
	    int table[][]=new int[n][n];
	 
	    // Initialize all table entries as 0
	 
	    // Fill the table
	    for (gap = 1; gap < n; ++gap)
	        for (l = 0, h = gap; h < n; ++l, ++h)
	    
	            table[l][h] = (str.charAt(l) == str.charAt(h))? table[l+1][h-1] :
	                          (min(table[l][h-1], table[l+1][h]) + 1);
	 
	    // Return minimum number of insertions for str[0..n-1]
	    return table[0][n-1];
	}

}
