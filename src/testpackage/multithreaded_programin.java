package testpackage;

import java.util.ArrayList;
class newthread implements Runnable {
    Thread t;
    newthread() {
        t = new Thread(this,"Hello");
        t.start();
    }
    public void run() {
        System.out.println(t.getName());
    }
}
class multithreaded_programing {
    public static void main(String args[]) {
        new newthread();
    }
}