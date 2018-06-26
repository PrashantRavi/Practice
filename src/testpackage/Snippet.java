package testpackage;

public class Snippet {
	public static void main(String[] args) {
		String str ="my ravi is ravi";
		String str1 ="my";
		int i = 0,j=0;
		int count =0;
		
		while(i<str.length()){
			
				if(str.charAt(i)==str1.charAt(j)){
					i++;
					j++;
				}
				else{
					i++;
				}
				
				if(j==str1.length()){
					j=0;
					count++;
				}
			
		}
		
		System.out.println(count);
		
	}
}

