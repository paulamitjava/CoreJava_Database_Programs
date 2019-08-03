
package basic;

class MultiThread implements Runnable {
    String str;
    MultiThread(String str){
        this.str=str;
    }
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(str+":"+i);
            try{
                Thread.sleep(1000); // cease thread execution for 2000 miliseconds
                }
            catch(InterruptedException ie){
                ie.printStackTrace();
                }
            } // end of for
        } // end of run
    }

 public class MultiTaskThread {
     public static void main(String args[]){
         // create two object to represent two task
         MultiThread mt1=new MultiThread("cut the ticket");
         MultiThread mt2=new MultiThread("show the ticket");
         // create two threads and attach them to the two objects
         Thread t1 = new Thread(mt1);
         Thread t2 = new Thread(mt2);
         System.out.println("hello111111111");
         t1.start();
         System.out.println("hello222222222222");
         t2.start();
         System.out.println("hello");
     }
   }

