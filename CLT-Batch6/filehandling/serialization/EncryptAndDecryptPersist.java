
package serialization;

import java.io.*;
import java.security.*;
import javax.crypto.*;

class EncryptAndDecryptPersist {

public static void main (String[] args) throws Exception{
    KeyPairGenerator keygenerator = KeyPairGenerator.getInstance("RSA");
    SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
    keygenerator.initialize(1024, random);

    KeyPair keypair = keygenerator.generateKeyPair();
    PrivateKey privateKey = keypair.getPrivate();
    PublicKey publicKey = keypair.getPublic();
    Cipher cipher = Cipher.getInstance("RSA");

    cipher.init(Cipher.ENCRYPT_MODE, publicKey);

    String st= "corejava";
    byte[] cleartext = null;
    cleartext = st.getBytes();
    byte[] ciphertext = null;
    ciphertext = cipher.doFinal(cleartext);
    
    FileWriter fw=new FileWriter("cipher.txt");
    BufferedWriter br=new BufferedWriter(fw);
    fw.close();
    br.write(ciphertext.toString());
    System.out.println("the encrypted text is: " + ciphertext.toString());

    FileReader fr = new FileReader("cipher.txt");
    BufferedReader br1 = new BufferedReader(fr);
    ciphertext = br1.readLine().getBytes();
    fr.close();
    cipher.init(Cipher.DECRYPT_MODE, privateKey);
    byte[] cleartext1 = cipher.doFinal(ciphertext);
    System.out.println("the decrypted cleartext is: " + new String(cleartext1));
}
}

