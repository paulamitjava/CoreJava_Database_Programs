
package basic;

class Sample implements Runnable{
    
    @Override
    public void run(){
        System.out.println("task three");
        
    }
    
    void play(){    // not print anything
        System.out.println("cricket");
    }
    
} // end of Sample class

public class ThreadC {
    public static void main(String args[]){
        Runnable r1 = new Runnable(){	// anonymous approach
            @Override
            public void run(){
                System.out.println("task one");
            }
        };	// end of anonymous
        Runnable r2 = new Runnable(){	// anonymous approach
            @Override
            public void run(){
                System.out.println("task two");
            }
        };	// end of anonymous
       
	Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
	Sample s = new Sample();
        Thread t3 = new Thread(s);
        
        t1.start();
        t2.start();
        t3.start();
        
    }   // end of main
}	// end of ThreadC class
