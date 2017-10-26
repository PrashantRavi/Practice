package hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectingRopes {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int cost =0;
		int N =sc.nextInt();
		for(int i=0;i<N;i++){
			pq.add(sc.nextInt());
		}
		System.out.println(pq);
		while(pq.size()>1){
			int a=pq.poll();
			int b=pq.poll();
			cost+=a+b;
			pq.add(a+b);
			System.out.println(pq);
		}
		
		System.out.println(cost);
		
	}

}
