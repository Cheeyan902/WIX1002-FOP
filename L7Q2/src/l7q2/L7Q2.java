package l7q2;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
public class L7Q2 {

   
    public static void main(String[] args) {
        
        try {
            
          //Get website content 
          URL u = new URL("https://www.aplustopper.com/essay-on-online-education/");
          URLConnection cnn = u.openConnection();
          InputStream stream = cnn.getInputStream();
          Scanner content = new Scanner(stream);
      
         //Write content into a file
         FileWriter file = new FileWriter("index.htm");
         String finalfile = "";
         
         //loop until the end of the line
         while(content.hasNextLine()){
             finalfile += content.nextLine() + "\n";
             System.out.println(finalfile);
         }
         //store content in a string and write the string 
         file.write(finalfile);
         
         content.close();
         file.close();
         
        }
        
        /*  Can also write in this way wihout declare a string 
        PrintWriter output = new PrintWriter(new FileOutputStream("index.html"));
        while(in.hasNextLine()){
            output.println(in.nextLine()); 
        } */
        
         catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
    

