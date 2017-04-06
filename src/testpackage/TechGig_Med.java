package testpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class TechGig_Med {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		sc.nextLine();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		//permute(str1, 0, N-1,str2);
		//System.out.println(count);
		System.out.println(appearanceCount(N,M,str1,str2));
	}
	
	
	public static int appearanceCount(int ip1,int ip2,String ip3,String ip4){
		ArrayList<String>arr =new ArrayList<String>();
		permute(ip3,0,ip1-1,ip4,arr);
		return arr.size();
	}
	
	public static ArrayList<String> permute(String str, int l, int r,String str2,ArrayList<String>arr)
    {
        if (l == r){
        	if(str2.contains(str)){
        		arr.add(str);
            }
        }
            
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,str2,arr);
                str = swap(str,l,i);
            }
        }
        return arr;
    }
	
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
