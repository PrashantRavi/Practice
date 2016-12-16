package testpackage;

import java.util.Scanner;

public class Amazon_14_ModifyArray {

	public static int main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		if(str.equals("")){
		return 0;
		}
		int I=Integer.parseInt(sc.nextLine());
		int J=Integer.parseInt(sc.nextLine());
		String strarr[]=str.split(",");
		
		StringBuffer result = new StringBuffer("");
		try{
			for(int k=0;k<strarr.length;){
				int i=I;
				while(i>0){
					result=result.append(strarr[k]+",");
					i--;
					k++;
				}
				int j=J;
				while(j>0){
					j--;
					k++;
				}
			}
			System.out.println(result.substring(0,result.length()-1));
			
		}catch(Exception e){
			
		}
		
		sc.close();
		return 0;
	}

}
