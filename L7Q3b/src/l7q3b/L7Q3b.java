package l7q3b;

import java.util.*;
import java.io.*;
public class L7Q3b {

    public static void main(String[] args) {
        String line = "Avicii";
        
        try{
            PrintWriter outputstream = new PrintWriter(new FileOutputStream("reverse.txt"));
            
            for(int i= line.length()-1; i>=0; i--){  //but maybe this kind of approach just suitable for question require for one line string cuz if more than one line we need .hasNextLine()
                outputstream.print(line.charAt(i));
            }
            
            outputstream.close();
            
            Scanner inputstream = new Scanner(new FileInputStream("reverse.txt"));
            
            System.out.print(inputstream.next());;
            
            inputstream.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
  }
}


/*File myobj = new file("abc.txt");
Scanner mydata = new Scanner(myobj);
while(mydata.hasNextLine()){
String b = mydata.nextLine();
System.out.println(b);}

or

Scanner mydata = new Scanner(new FileInputStream("abc.txt"));
while(mydata.hasNextLine()){
String b = mydata.nextLine();
System.out.println(b);
} */
