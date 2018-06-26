package arrays;

public class RemoveOneMakePalindrome {
	
	
	
	public static boolean isPalindrome(int low,int high, char strarr[]){
		while(low<high){
			if(strarr[low]!=strarr[high]) return false;
			low++;
			high--;
		}
		return true ;
	}
	
	public static int PossiblePalindrome(char strarr[]){
		int i=0;
		int j= strarr.length -1;
		
		while(i<j){
			if(strarr[i]==strarr[j]){
				i++;
				j--;
			}
			
			else{
				if(isPalindrome(i+1,j,strarr))
					return i;
				
				if(isPalindrome(i,j-1,strarr))
					return j;
			}
		}
		
		return -2;
	}

	public static void main (String [] a){
		String str = "abcdba";
		char strarr [] = str.toCharArray();
		System.out.println(PossiblePalindrome(strarr));
		
	}
}
