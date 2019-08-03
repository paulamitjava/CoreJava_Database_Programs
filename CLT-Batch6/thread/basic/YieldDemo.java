// yield() : pause current running thread a give a chance to any other thread.
package basic;

class Test implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread());
       Thread.yield();
        
        //It Causes the currently executing thread to temporarily pause 
        //and allow other threads to execute.
        System.out.println(Thread.currentThread());
    }
}

public class YieldDemo {
    public static void main(String[] args){
        Test obj1=new Test();
        Thread t1=new Thread(obj1,"1st");
        t1.start();
        
        Test obj2=new Test();
        Thread t2=new Thread(obj2,"2st");
        t2.start();
        
        Test obj3=new Test();
        Thread t3=new Thread(obj3,"3rd");
        t3.start();
        
        Test obj4=new Test();
        Thread t4=new Thread(obj4,"4th");
        t4.start();
    }
}
