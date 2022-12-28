package l7q1;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class L7Q1 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> course = new LinkedHashMap<>(4);
        Scanner sc = new Scanner(System.in);

        // Structure table data into hashmap
        course.put("WXES1116", "Programming I");   //.put means insert the set of data into hashmap
        course.put("WXES1115", "Data Structure");
        course.put("WXES1110", "Operating System");
        course.put("WXES1112", "Computing Mathematics I");

        try {

            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("courses.dat"));

            for (String code: course.keySet()) {  //.keyset means will return the set of key inside course to array code
                file.writeUTF(code);       
                file.writeUTF(course.get(code)); //.get(code) return the value to which the specific value that contains inside one set to specific key
            }                                         // eg: key = wxes1112 and value is Programming I, when write .get(wxes1112) will get Programming I

            file.close();
        }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }

        // Read from courses.dat
        try {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("courses.dat"));
            String code = "", temp = "";

            System.out.print("Enter the course code: ");
            code = sc.next();

            while (!code.equalsIgnoreCase(temp)) {    //it will keep the loop runs if code entered is not matched to the arranged set of values means the coursename
                temp = file.readUTF(); //eg: initially, code = WXES1112, and temp = " ", not equal, so temp will read and become Programming I, now code is equal to temp whhich means the key is matched with correct value and being printed out
            }                          //else loop continues and temp will keep changing until it matches correctly with the code entered

            System.out.printf("Course name for %s is %s.", code,file.readUTF());

            file.close();
            
        }
        catch (EOFException e) {}
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }

        sc.close();
    } 
}
