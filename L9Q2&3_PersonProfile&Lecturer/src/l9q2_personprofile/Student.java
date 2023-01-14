package l9q2_personprofile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;

public class Student extends PersonProfile {
    
    //Instance Variable
    protected String courseCode;
    protected LinkedHashMap <String,String> courseName = new LinkedHashMap <>();
    protected LinkedHashMap <String,Integer> semester = new LinkedHashMap <>();
    protected LinkedHashMap <String,Integer> session = new LinkedHashMap <>();
    protected LinkedHashMap <String,Double> mark = new LinkedHashMap <>();
   
    //Constructor
    public Student(String NAME, char GENDER, String DATEBIRTH, String fileName){
        
         super(NAME, GENDER, DATEBIRTH);
         
         try{
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L9Q2_PersonProfile\\src\\src\\" + fileName));
             
             while((this.courseCode = reader.readLine()) != null){
                 
                 this.courseName.put(this.courseCode, reader.readLine());
                 this.semester.put(this.courseCode, Integer.parseInt(reader.readLine()));
                 this.session.put(this.courseCode, Integer.parseInt(reader.readLine()));
                 this.mark.put(this.courseCode, Double.parseDouble(reader.readLine()));
             }
             
             reader.close();
             
         }catch(FileNotFoundException e){
             System.out.println("File Not Found.");
         }catch(IOException e){
             System.out.println("Problem with file input.");
         }
    }
         
     //Methods
     private String getGrade(double mark){
        if (mark >= 85) { return "A"; }
        if (mark >= 75) { return "A-"; }
        if (mark >= 70) { return "B+"; }
        if (mark >= 65) { return "B"; }
        if (mark >= 60) { return "B-"; }
        if (mark >= 55) { return "C+"; }
        if (mark >= 45) { return "D"; }
        if (mark >= 35) { return "E"; }
        else { return "F"; }
     }
        
     public void displayDetails(){
         this.displayProfile();
         System.out.println("\nCourse Details: \n");
         for(String str : this.courseName.keySet()){
             System.out.printf("%s %s (Semester %d Session %d) Grade: %s.\n", str, this.courseName.get(str),this.semester.get(str), this.session.get(str), getGrade(this.mark.get(str)));
         }
         System.out.println();
     }       
}
