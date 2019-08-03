
package basic;

import java.io.*;
import java.net.*;

public class ClientApplication {
    public static void main(String args[]) throws Exception {
        // create client side socket with port number 999
        Socket s = new Socket ("localhost",1010);
        // to accept data from server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // receive data as long as server does not close client socket
        String str;
        while((str=br.readLine())!=null)
             System.out.println(str);
             br.close();
             s.close();
    }
  }

