
package basic;

class Priority extends Thread{
    int count =0;
    public void run(){
        for(int i=1;i<=10;i++)
          count++; // count numbers upto 10
          // display which thread has completed counting and its priority
         System.out.println("completed thread: "+Thread.currentThread().getName());
         System.out.println("Its Priority: "+Thread.currentThread().getPriority());
     } // end of run()
} // end of Priority class

class PriorityThread {
    public static void main(String args[]){
        Priority p = new Priority();
        Thread t1=new Thread(p,"one");
        Thread t2=new Thread(p,"two");
        Thread t3=new Thread(p,"three");
        
	// set priority for them
             
        t1.setPriority(9); // Thread.MIN_PRIORITY (1)
        t2.setPriority(Thread.NORM_PRIORITY); // priority is 5
        t3.setPriority(Thread.MAX_PRIORITY); // priority is 10
        
        t1.start();
        t3.start();
        t2.start();
        }
  }
