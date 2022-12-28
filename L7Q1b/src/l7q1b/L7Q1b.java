package l7q1b;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
public class L7Q1b {

    public static void main(String[] args) {
        String [][] courses = {
            {"WXES1116", "Programming I"},
            {"WXES1115", "Data Structure"},
            {"WXES1110", "Operating System"},
            {"WXES1112", "Computing Mathematics I"}};
    
        try{
            ObjectOutputStream outputstream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            
            for(String [] coursenew : courses){  //for row, coursenew array will get all contents in row 1 within that 3 rows
                for(String course1 : coursenew){ //for column, string course1 will get all contents in row 1 where coursnew get
 //                  for(int i=0; i<courses.length; i++)  //this two 21,22 lines used same concept as 19,20, press enter at line 21,22 will get lines 19,20
 //                      for(int j=0; j<courses[i].length; j++)
                    outputstream.writeUTF(course1);
                }
            }
            outputstream.close();
        }
        catch(IOException e){
            System.out.println("Problems with file outputs");
        }
        
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the course code: ");
        String code = cs.next();
        
        try{
            ObjectInputStream inputstream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while(inputstream.available()>=0){  //input.available used to check the remaining bytes that can be read from the output file
                                                //it will not be 0 if there is still have input
                  String coursecode = inputstream.readUTF();
                  String coursename = inputstream.readUTF(); //use this two string to compare with code you wrote and print the respective coursename
                  
                  if(code.equalsIgnoreCase(coursecode)){
                      System.out.println("Course name: " + coursename);
                      break;
                  }                               
            }
           inputstream.close(); 
        }
        catch(EOFException e){
        }
        catch(FileNotFoundException e){
            System.out.println("file cannot found");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }    
    }
}