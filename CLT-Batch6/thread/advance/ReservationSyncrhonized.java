// two threads acting on same object - Thread Synchronization
package advance;

class ReserveBerth implements Runnable {
    int available = 10;
    int wanted;
    ReserveBerth(int i){
        wanted=i;
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
        
class SynchronizedThread {
    public static void main(String args[]){
        ReserveBerth r = new ReserveBerth(3); // tell that 1 berth is needed
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        Thread t4=new Thread(r);
        Thread t5=new Thread(r);
        Thread t6=new Thread(r);
        t1.setName("Ajay");
        t2.setName("Rahul");
        t3.setName("Sachin");
        t4.setName("Gautam");
        t5.setName("Anil");
        t6.setName("paul");
        
     //   t1.setPriority(Thread.MIN_PRIORITY);
     //   t3.setPriority(Thread.MAX_PRIORITY);
     //   t4.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
      }
    }


