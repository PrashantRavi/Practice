package multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{

	private int id;
	 public Processor(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		System.out.println("Starting "+id);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed "+id);
		
	}
	
}
public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService exec= Executors.newFixedThreadPool(4);
		
		for(int i=0;i<5;i++){
			exec.submit(new Processor(i));
		}
		
		exec.shutdown();
		
		System.out.println("All task Submitted");
		
		try {
			exec.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task Completed");

	}

}
