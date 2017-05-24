package testpackage;

import java.util.*;


class Arun {
	    public static void main(String args[] ) throws Exception {
	    	Scanner sc =new Scanner(System.in);
	    	int a[][]=new int[4][4];
	    	for(int i=0;i<4;i++){
	    		for(int j=0;j<4;j++){
	    			a[i][j]=sc.nextInt();
	    		}
	    	}
	    	
	    	 
	    	    spiralPrint(4, 4, a);
	    }
	    
	    
	    public static void spiralPrint(int m, int n, int a[][])
	    {
	        int i, k = 0, l = 0;
	 
	     
	        while (k < m && l < n)
	        {
	            /* Print the first row from the remaining rows */
	            for (i = l; i < n; ++i)
	            {
	                System.out.print(a[k][i]+" ");
	            }
	            k++;
	     
	            /* Print the last column from the remaining columns */
	            for (i = k; i < m; ++i)
	            {
	            	System.out.print(a[i][n-1]+" ");
	            }
	            n--;
	     
	            /* Print the last row from the remaining rows */
	            if ( k < m)
	            {
	                for (i = n-1; i >= l; --i)
	                {
	                	System.out.print(a[m-1][i]+" ");
	                }
	                m--;
	            }
	     
	            /* Print the first column from the remaining columns */
	            if (l < n)
	            {
	                for (i = m-1; i >= k; --i)
	                {
	                	System.out.print(a[i][l]+" ");
	                }
	                l++;    
	            }        
	        }
	    }
	}