
package basic;

public class ThreadE extends Thread{
    @Override
    public void run(){
        System.out.println("running..");
    }
    public static void main(String args[]){
        ThreadE t1 = new ThreadE();
        ThreadE t2 = new ThreadE();
        ThreadE t3 = new ThreadE();
        ThreadE t4 = new ThreadE();
                
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t4:"+t4.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("Name of t3:"+t3.getName());
                
        System.out.println("ID of t1:"+t1.getId());
        System.out.println("ID of t2:"+t2.getId());
        System.out.println("ID of t3:"+t3.getId());
        t2.start();
        t1.start();
        t1.setName("paul thread");
        System.out.println("Modified Name of t1:"+t1.getName());
        t3.start();
        System.out.println("ID of t4:"+t4.getId());
        t4.run();
    }
}
