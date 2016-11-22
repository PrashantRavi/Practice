package testpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*Simple Game

Monk and !Monk decided to play a simple number game. Each of them had a set of numbers (may contain a number more than once) to play with. Lets denote by A[]
the set belonging to Monk, and by B[]

, the set belonging to !Monk.

They defined three functions f(x)
, g(x) and V(x)

:

f(x)
: Returns count of numbers strictly smaller than x

in opponent's set

g(x)
: Returns count of numbers strictly greater than x

in opponent's set

V(x)
: f(x)×g(x)

Score of a player is defined to be the ∑V(x)
for each element x

present in the players set.

The player with higher

score wins the game.

Input:

    The first line contains two positive integers N and M where N and M represent the number of elements present in Monk and !Monk's sets respectively.
    The second line contains N space separated integers - elements present in Monk's set
    The third line contains M space separated integers - elements present in !Monk's set

Output:

    If Monk wins, print "Monk" (without quotes) followed by a space and the score difference between him and !Monk
    If !Monk wins, print "!Monk" (without quotes) followed by a space and the score difference between him and Monk
    If both players have equal scores, then print "Tie" (without quotes).

Constraints:

1≤N,M≤105

0≤A[i],B[i]≤109

Sample Input
(Plaintext Link)

2 2
1 3
0 5

Sample Output
(Plaintext Link)

Monk 2


*/

public class Accolite1 {
	
	


	public static void main(String[] args)  {
		
	    Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		int brr[] = new int[M];
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			brr[i] = sc.nextInt();
		}
		
	Arrays.sort(arr);
	Arrays.sort(brr);
	
	
		
		int result1 = 0;
		for (int i = 0; i < N; i++) {
			int f = 0, g = 0;
			if(map1.get(arr[i])==null){
				for (int j = 0; j < M; j++) {
					if(arr[i]<brr[j]){
						f=j;
						if(arr[i]==brr[j]){
							g=M-j-1;
						}else{
							g=M-j;
						}
						break;
					}

				}
				map1.put(arr[i],f*g );
				result1 += f * g;	
			}
			
			result1 += f * g;
		}
		int result2 = 0;
		for (int i = 0; i < M; i++) {
			int f = 0, g = 0;

			for (int j = 0; j < N; j++) {
				
				if(brr[i]<arr[j]){
					f=j;
					if(brr[i]==arr[j]){
						g=N-j-1;
					}else{
						g=N-j;
					}
					break;
					
					
				}
			}
			result2 += f * g;
		}
		if (result1 > result2) {
			System.out.println("Monk " + (result1 - result2));
		} else if (result1 < result2) {
			System.out.println("!Monk " + (result2 - result1));
		} else
			System.out.println("Tie");
	}

}
