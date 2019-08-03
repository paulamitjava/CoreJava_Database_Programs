
package basic;

class JoinApplication extends Thread {
@Override
public void run() {
for (int i=1;i<=5;i++) {
try {
    System.out.println(""+Thread.currentThread().getName());
Thread.sleep(500);
}
catch(Exception e) { System.out.println(e); }
System.out.println(i);
} // end of for
} // end of run()
public static void main(String args[]) {
JoinApplication t1 = new JoinApplication();
t1.setName("THREAD t1");
JoinApplication t2 = new JoinApplication();
t2.setName("THREAD t2");
JoinApplication t3 = new JoinApplication();
t3.setName("THREAD t3");
t1.start();
t2.start();
try {
t1.join();
}
catch(Exception e) { System.out.println(e); }

t3.start();
} }