package w8e3;

import java.util.*;
import java.io.*;
public class W8E3 {

    public static void main(String[] args) {
       
        try{
            PrintWriter outputstream = new PrintWriter(new FileOutputStream("data.txt"));
          
            String sentence = "THE NIGHT";
            
            for(int i=0; i<sentence.length(); i++){
                char letter = sentence.charAt(i);
                outputstream.print(Integer.toBinaryString(letter) + " ");
                /*int ascii = (int)letter;
                binary = Integer.toBinaryString(ascii); */
            }
           
            outputstream.close();
            
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
                  
        try{
            Scanner inputstream = new Scanner(new FileInputStream("data.txt"));
           
            while(inputstream.hasNext()){  //hasNextline is for statement got diff lines
                String BinaryNumber = inputstream.next();
                System.out.print((char)Integer.parseInt(BinaryNumber,2));
            }
            
            inputstream.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
        
    }
    
}


