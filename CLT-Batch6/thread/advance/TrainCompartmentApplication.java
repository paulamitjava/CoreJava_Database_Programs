
package advance;

class BookTicket extends Thread {
    Object train, comp;
    BookTicket(Object t, Object c) {
        train=t;
        comp=c;
    }
    public void run() {
        synchronized(train) {
            System.out.println("BookTicket locked on train object");
            try{
                Thread.sleep(150);
               }
            catch(InterruptedException ie){
               }
            System.out.println("BookTicket now waiting to lock on compartment object");
            synchronized(comp){
                System.out.println("BookTicket locked on compartment object");
            }
        }
    }
  }

class CancelTicket extends Thread {
    Object train, comp;
    CancelTicket(Object train, Object comp) {
        this.train=train;
        this.comp=comp;
    }
    public void run() {
        synchronized(train) {  // train to avoid deadlock
            System.out.println("CancelTicket locked on train object");
            try{
                Thread.sleep(200);
               }
            catch(InterruptedException ie){
               }
            System.out.println("CancelTicket now waiting to  on comp object");
            synchronized(comp){   //comp to avoid deadlock
                System.out.println("CancelTicket locked on comp object");
            }
        }
    }
  }    

public class TrainCompartmentApplication {
    public static void main(String args[]){
    Object t = new Object();
    Object c = new Object();
    BookTicket ref1 = new BookTicket(t,c);
    CancelTicket ref2 = new CancelTicket(t,c);
    Thread t1 = new Thread(ref1);
    Thread t2 = new Thread(ref2);
    t1.start();
    t2.start();
   }
}