
package basic;

public class Test5_7 {
    
    void waitForSignal() { 
        Object obj = new Object(); 
        synchronized (Thread.currentThread()) { 
        //    obj.wait(); 
            obj.notify(); 
        } 
    }
    
    public static void main(String args[]){
    }
}
