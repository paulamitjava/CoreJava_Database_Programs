
package basic;

public class Test5_8 extends Thread { 
    private int x=2; 
    public Test5_8() throws Exception { 
        
       // x=n;
        x=5; 
        start(); 
        
    } 
    
    public void makeItDo() throws Exception { 
        x=x-1; 
        System.out.println(x); 
    } 
    public void run() { 
        x*=2; 
        //System.out.println(x);
    } 
    
    public static void main(String[] args) throws Exception { 
        new Test5_8().makeItDo();
        //new Test5_8();
    } 
}


