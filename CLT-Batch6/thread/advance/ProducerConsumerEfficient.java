// how to use wait and notify
// most efficient way of thread communication
package advance;

class Producer1 extends Thread {
    // to add data, use string buffer object
    StringBuffer sb;
    // dataprodover will be be true when data production is over
    Producer1(){
        sb = new StringBuffer(); // allot memory
        }
    public void run(){
        synchronized(sb){
        // go on appending data to string buffer
        for(int i=1;i<=3;i++){
            try{
                sb.append(i+":");
                Thread.sleep(500);
                System.out.println("appending data");
                 sb.notify();
              //   System.out.println("done");
                }
            catch(Exception e) { }
        }
        // data production is over, so notify to consumer thread
      
        } // end of synchronized
    } // end of run()
  } // end of Producer class

class Consumer1 extends Thread {
    // create Producer reference to refer to Producer object from consumer class
    Producer1 prod;
    Consumer1(Producer1 prod){
        this.prod=prod;
    }
    public void run(){
        synchronized(prod.sb){
        // wait till notification is received from Producer thread
        try{
       //         System.out.println("before wait.. ^I am in consumer");
       // prod.sb.wait();
            System.out.println("I am in consumer");
           }        
           
        catch(Exception e) { e.printStackTrace();} 
        // when data production is over, display data of stringbuffer
           
         System.out.println(prod.sb);
    } // end of synchronized
  } // end of run()
} // end of Consumer1 class

class ProducerConsumerEfficient {
    public static void main(String args[])throws Exception {
        Producer1 p = new Producer1();
        // pass producer object to consumer so that it is then available o consumer
        Consumer1 c = new Consumer1(p);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        // run the threads
        t1.start(); // consumer waits
        t2.start(); // producer starts prduction
    }
}
