
package file;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordLine {

	public static void main(String[] args) {
		System.out.println("Please enter the filename: ");
	    Scanner input = new Scanner(System.in);
	    
	    String fileName = input.next();  // input.nextLine()
	    
	     FileReader fReader;
	        try {
	            fReader = new FileReader(fileName);
	            BufferedReader reader = new BufferedReader(fReader);
	            String cursor; // 
	            String content = "";
	            int lines = 0;
	            int words = 0;
	            int chars = 0;
	            while((cursor = reader.readLine()) != null){
	                // count lines
	                lines += 1;
	                content += cursor;
	                
	                // count words
	                String []_words = cursor.split(" ");
	                for( String w : _words)
	                {
	                  words++;        
	                }
	                
	            }
	            chars = content.length();
	            
	            System.out.println("File " + fileName + " has ");
	            System.out.println(chars + " Characters,");
	            System.out.println(words + " words and " + lines + " lines.");
	            
	            
	        } catch (FileNotFoundException ex) {
	           // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	            System.out.println("File not found!");
	        } catch (IOException ex) {
	            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	             System.out.println("An error has occured: " + ex.getMessage());
	        }
	}
}
