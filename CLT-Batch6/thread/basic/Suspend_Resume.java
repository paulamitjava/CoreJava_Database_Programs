// suspend(), resume() and destroy()
package basic;

class TestClass extends Thread {
    @Override
    public void run(){
        try{
            for(int i=1;i<=3;i++){
            System.out.println("i am inside TestClass..");
            }
        }
        catch(Exception ae){
            System.out.println(ae);
        }
    }
}

public class Suspend_Resume {
    public static void main(String args[]){
        TestClass tc1=new TestClass();
        tc1.start();
        
        tc1.suspend();//its suspends the current thread.
        //tc1.destroy();
        
        for(int j=0;j<=2;j++){
            System.out.println("I am inside main..");
        }
        
        tc1.resume();//its resume the suspended thread.
    }
}
