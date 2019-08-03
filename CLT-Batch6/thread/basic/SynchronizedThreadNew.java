package basic;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//two threads acting on same object - Thread Synchronization

class ReserveBerthNew implements Runnable {
 int available = 15;
 int wanted;
 ReserveBerthNew(int a){
     wanted=a;
 }
 
 public void run(){
     synchronized(this){     // synchronized current thread
         System.out.println("Available berths: "+available);
             if (available>=wanted){
             // get the name of the passenger
             String name = Thread.currentThread().getName();
             // allot the berth for him
             System.out.println(wanted+"Berths reseved for "+name);
             try{
                // Thread.sleep(2000); // wait for printing the ticket
                 available=available-wanted;     //update the no. of available berths
                 }
             catch(Exception ie){
                 }
             } // end of if
          else
             System.out.println("Sorry.. no berth available");
     } // end of synchronized   
   } // end of run
 } // end of class
     
class SynchronizedThreadNew {
 public static void main(String args[]){
	 
	 //ExecutorService executor = Executors.newCachedThreadPool();
     ExecutorService executor = Executors.newFixedThreadPool(10);
     executor.execute(new ReserveBerthNew(4));
     	      
   }
 }

