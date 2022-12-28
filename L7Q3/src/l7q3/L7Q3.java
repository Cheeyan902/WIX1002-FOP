package l7q3;

import java.io.*;
import java.util.*;
public class L7Q3 {

    public static void main(String[] args) {
        
        try{
           //write a file without reverse
           PrintWriter output = new PrintWriter(new FileOutputStream("Normal.txt"));
           output.write("Hola, mucho gusto.");
           output.write("\nComo estas?");
            
           output.close();
           
           //read the file without reverse
           Scanner input = new Scanner(new FileInputStream("Normal.txt"));
           
           //write the file that reverse the origin file
           PrintWriter outputstream = new PrintWriter(new FileOutputStream("Reverse.txt"));
           
           while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
                String reversedline = new StringBuilder(line).reverse().toString();
                //use StringBuilder class, a mutable sequence of characters,can add the append ,reverse and insert methods, which are overloaded so as to accept data of any type
                //use method like .reverse() to make this character sequence to be replaced by the reverse of the sequence/.toString() returns a string representing the data in this sequence.
                outputstream.write(reversedline + "\n"); //add \n to seperate line 1 and line 2
           }
           
           input.close();
           outputstream.close();
           
           //read the reverse file
           Scanner inputstream = new Scanner(new FileInputStream("Reverse.txt"));
           
           while(inputstream.hasNextLine()){
               System.out.println(inputstream.nextLine());
           }
           
           inputstream.close();
           
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
    } 
}
