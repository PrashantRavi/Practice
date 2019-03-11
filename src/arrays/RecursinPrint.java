package arrays;

public class RecursinPrint {

	public static void main(String[] args) {
		new RecursinPrint().print(15);

	}
	
	public void print(int n){
		if (n==0) return ;
		print(n-1);
		System.out.println(n);
	}

}
