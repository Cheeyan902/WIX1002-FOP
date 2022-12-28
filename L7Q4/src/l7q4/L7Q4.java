package l7q4;

import java.io.*;
public class L7Q4 {

    public static void main(String[] args) {
        int numline = 0, numword = 0, numchar = 0;
        
        try{
            PrintWriter output = new PrintWriter(new FileOutputStream("Num.txt"));
            
            output.write("The night is young!");
            output.write("\nHaving a fun tonight."); //when writing \n, it should be bonded with word else it will be considered as one word
            output.close();
            
            BufferedReader file = new BufferedReader(new FileReader("Num.txt"));
            
            String line = file.readLine();
            
            while(line!=null){
                numline += 1;
                String [] words = line.split(" "); //or numword += line.split(" ").length();
                numword += words.length;
                numchar += line.length();
                line = file.readLine();  //when using while, we need to read line again cuz while loop is based on condition, without rewrite line it will keep loop running inside
            }
  
            file.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("Problem with file input");
        }
      
        System.out.printf("There are %d characters, %d words and %d lines.\n", numchar,numword,numline);
    }
}
