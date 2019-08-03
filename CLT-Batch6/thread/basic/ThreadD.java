
package basic;

class ThreadD extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=3;i++){
            try{
               Thread.sleep(10000); // milliseconds
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
            System.out.println(currentThread().getName());
        }
      }
    
    public static void main(String args[]){
        ThreadD t1 = new ThreadD();
        ThreadD t2 = new ThreadD();
        ThreadD t3 = new ThreadD();
        ThreadD t4 = new ThreadD();
        ThreadD t5 = new ThreadD();
        t1.setName("thread t1");
        t2.setName("thread t2");
        t3.setName("thread t3");
        t4.setName("thread t4");
        t5.setName("thread t5");
       
        t1.start();
        t2.start();
        t3.start();
      /*  try{
            t3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
      */  t4.start();
        
        t5.start();
    }
}


