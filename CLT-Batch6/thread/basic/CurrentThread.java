
package basic;

public class CurrentThread extends Thread {
    public void run(){
        Thread t2 = Thread.currentThread();
        System.out.println("Current Thread is: "+t2);
        System.out.println("Thread Name is: "+t2.getName());
        System.out.println("Thread ID is: "+t2.getId());
    }
    public static void main(String args[]) {
        Thread t1 = Thread.currentThread();
        System.out.println("Current Thread is: "+t1);
        System.out.println("Thread Name is: "+t1.getName());
        System.out.println("Thread ID is: "+t1.getId());
//        CurrentThread.run();
        CurrentThread t2 = new CurrentThread();
        t2.start();
    }
   }
