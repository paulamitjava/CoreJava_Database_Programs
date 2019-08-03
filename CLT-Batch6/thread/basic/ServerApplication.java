
package basic;

import java.io.*;
import java.net.*;

class ServerApplication implements Runnable {
    static ServerSocket ss;
    static Socket s;
    public void run(){
        // find thread name
        String name=Thread.currentThread().getName();
        for(;;) // server runs continuously
        {
            try{
                System.out.println("Thread "+name+" ready to accept..");
                s = ss.accept();
                // for sending message
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Thread "+name+" contcted to you");
                // close connection
                ps.close();
                s.close();
                //do not close ServerSocket
            }
            catch(Exception e) { }
          }
        }
            
      public static void main(String args[]) throws Exception {
            ServerApplication sa = new ServerApplication();
            // create server scocket with 999 as a port
            ss = new ServerSocket(1010);
            Thread t1 = new Thread(sa,"one");
            Thread t2 = new Thread (sa,"two");
            t1.start();
            t2.start();
        }
    }
  
    

