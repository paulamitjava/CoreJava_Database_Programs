
package basic;

public class DaemonThread {
    public static void main(String args[]){
        Thread oracle =new Thread();
        Thread picasa =new Thread();
        oracle.setDaemon(true);
        boolean x = oracle.isDaemon();
        boolean y = picasa.isDaemon();
        System.out.println(" Oracle thread is a Daemon? : "+x);
        System.out.println(" Picasa thread is a Daemon? : "+y);
    }
  }
