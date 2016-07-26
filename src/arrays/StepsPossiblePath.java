package arrays;

public class StepsPossiblePath {

	
	public int possibleWays(int n){
		if (n<0)
			return 0;
		return possibleWays(n-1)+possibleWays(n-2) +possibleWays(n-3)+1;
		
	}
	
	public int poosibleWaysDyna(int n, int[] dyn) {
		if (n < 1) {
			return 0;
		}
		if (dyn[n] > 0) {
			return dyn[n];
		}
		dyn[n] = 1 + poosibleWaysDyna(n - 1, dyn) + poosibleWaysDyna(n - 2, dyn)
				+ poosibleWaysDyna(n - 3, dyn);
		return dyn[n];
}
	public static void main(String[] args) {
		StepsPossiblePath p1= new StepsPossiblePath();
		int n = 3;
		int[] dyn = new int[n + 1];
		System.out.println(p1.poosibleWaysDyna(n,dyn));

	}

}
