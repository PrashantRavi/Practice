package multithreding;

import java.util.Scanner;

class Process extends Thread{
	
	private volatile boolean running=true;
	static int count=0;
	
		public void run(){
			while(running){
				System.out.println("Hello World");
				try {
					Thread.sleep(10);
					count++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		public void shutdown(){
			running=false;
			System.out.println("Count  "+count);
		}
	
}
public class ThreadVolatile {

	public static void main(String[] args) {
		
		Process p1= new Process();
		p1.start();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		p1.shutdown();	
		

	}

}
