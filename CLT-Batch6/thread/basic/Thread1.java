package basic;
import java.io.*;

// class MyThread extends Thread {
  class MyThread implements Runnable { 
    boolean stop = false;  // running
    public void run(){
        for (int i=1;i<=100000;i++){
            System.out.println(i);
            if(stop)
                return;
        }
    } // end of run()
} // end of MyThread

 class Thread1 {
    public static void main(String args[]) throws IOException{
        
        // MyThread obj = new MyThread();
       //  Thread t = new Thread(obj);
        Thread t1 = Thread.currentThread();
        System.out.println("Current Thread is: "+t1);
        System.out.println("Thread Name is: "+t1.getName());
        MyThread obj = new MyThread();
        Thread t2 = new Thread(obj);
        System.out.println("Thread Name is: "+t2.getName());
            t2.start();
         //   t2.start();
            System.in.read();
            obj.stop = true;  // break
    } // end of main()
   } // end of Thread1
