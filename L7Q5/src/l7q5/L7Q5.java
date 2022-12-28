package l7q5;

import java.io.*;
import java.util.*;
public class L7Q5 {

    public static void main(String[] args) {
        
        int totalrecord;
        
       try{
           
           ObjectInputStream file = new ObjectInputStream(new FileInputStream("person.dat"));
           
           LinkedHashMap<String,Integer> data1 = new LinkedHashMap <>();
           LinkedHashMap<String,Character> data2 = new LinkedHashMap <>();
           
           totalrecord = file.readInt();
           
           //Link the data together with name in array first
           String [] name = new String [totalrecord];
           
           for(int i=0; i<name.length; i++){
               
               name[i]=file.readUTF();
               
               data1.put(name[i], file.readInt());
               data2.put(name[i], file.readChar());
           }
           
           Arrays.sort(name);
           
           //Execute all set of data by store it in an array called names and get the dsta
           for(String names: name){  //set object key as names, and get the data by writing its object key
               System.out.printf("Name: %s, Age: %d, Gender: %s\n", names,data1.get(names), data2.get(names));
           }
           
           file.close();
           
       }catch(FileNotFoundException e){
           System.out.println("File not found.");
       }catch(IOException e){
           System.out.println("Problem with input.");
       }
       
    }
    
}
