// inefficient way of thread communication
package advance;

class Producer extends Thread {
    // to add data, use string buffer object
    StringBuffer sb;
    // dataprodover will be be true when data production is over
    boolean dataprodover = false;
    Producer(){
        sb = new StringBuffer(); // allot memory
        }
    public void run(){
        // go on appending data to string buffer
        for(int i=1;i<=10;i++){
            try{
                sb.append(i+":");
                Thread.sleep(100);
                System.out.println("appending data");
                }
            catch(Exception e) { }
        }
        // data production is over, so store true into dataprodover
        dataprodover=true;
    } // end of run
} // end of Producer

class Consumer extends Thread {
    // create Producer reference to refer to Producer object from consumer class
    Producer prod;
    Consumer(Producer prod){
        this.prod=prod;
    }
    public void run(){
        //if the data production is not over, sleep for 10 milliseconds and check again
        try{
            while(!prod.dataprodover)
                Thread.sleep(200);  // 10 = priority
            }        
        catch(Exception e) { }
        // when data production is over, display data of stringbuffer
    //    System.out.println(prod.sb);
    }
}

class ProducerConsumerInefficient {
    public static void main(String args[]){
        Producer p = new Producer();
        // pass producer object to consumer so that it is then available o consumer
        Consumer c = new Consumer(p);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        //  run the threads
        t1.start(); // consumer waits
        t2.start(); // producer starts prduction
    }
}
