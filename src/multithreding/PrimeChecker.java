package multithreding;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PrimeChecker {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum number to check: ");
        Integer number = sc.nextInt();

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(number);

        NumberEnumerationTask initialize = new NumberEnumerationTask(queue, number);
        new Thread(initialize).start();

        for (int i = 0; i <= number; i++) {
            new Thread(new PrimeRunner(queue)).start();
        }

        sc.close();
    }

}



 class PrimeRunner implements Runnable {

    private BlockingQueue<Integer> queue;

    public PrimeRunner(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            boolean done = false;
            while (!done) {
                Integer checkNumber = queue.take();
                if (checkNumber == NumberEnumerationTask.DUMMY) {
                    queue.put(checkNumber);
                    done = true;
                } else {
                    checkPrimeNumber(checkNumber);
                }
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkPrimeNumber(Integer number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                queue.remove(number);
                break;
            } 
        }
        if (isPrime == true) {
            System.out.print(number + " ");
            queue.remove(number);
        }
    }
}




class NumberEnumerationTask implements Runnable {
    private BlockingQueue<Integer> queue;
    private Integer maximum;
    public static Integer DUMMY = new Integer(0);

    public NumberEnumerationTask(BlockingQueue<Integer> queue, Integer maximum) {
        this.queue = queue;
        this.maximum = maximum;
    }

    @Override
    public void run() {
        try {
           enumerate();
           queue.put(DUMMY);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    /**
    * Create a BlockingQueue contain Integer number from 1 to maximum.
    * @throws InterruptedException
    */
    private void enumerate() throws InterruptedException {
        for (int i = 2; i < maximum; i++) {
           queue.put(i);
        }
    }
}
