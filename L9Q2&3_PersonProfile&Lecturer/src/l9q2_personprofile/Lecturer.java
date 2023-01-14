package l9q2_personprofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Lecturer extends PersonProfile{
    
    protected String courseCode;
    protected LinkedHashMap<String, String> courseName = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> session = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> semester = new LinkedHashMap<>();
    protected LinkedHashMap<String, Double> creditHours = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> studentCount = new LinkedHashMap<>();
    
    public Lecturer(String NAME, char GENDER, String DATEBIRTH, String fileName){
    
        super(NAME, GENDER, DATEBIRTH);
        
        try {
            
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L9Q2_PersonProfile\\src\\src\\" + fileName));
            
            while ((this.courseCode = file.readLine()) != null) {
                this.courseName.put(this.courseCode, file.readLine());
                this.session.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.semester.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.creditHours.put(this.courseCode, Double.parseDouble(file.readLine()));
                this.studentCount.put(this.courseCode, Integer.parseInt(file.readLine()));
            }
            
            file.close();
            
        }catch (FileNotFoundException e){
            System.out.println("File Not Found.");}
        catch (IOException e){ 
            System.out.printf("Problem with file input."); 
        }
        }
    
    //Methods
    private void computeCredit() {
        for (String code: this.creditHours.keySet()) {
            double credits = this.creditHours.get(code);
            int count = this.studentCount.get(code);
            this.creditHours.put(code, credits * (count >= 150 ? 3 : count >= 100 ? 2 : count >= 50 ? 1.5 : 1));
        }
    }
    
     public void displayDetails() {
        this.displayProfile();
        this.computeCredit();
        System.out.println("\nCourse Profile:\n");
        for (String code: this.courseName.keySet()) {
            System.out.printf("%s %s (Semester %d Session %d): %.2f Credit Hours for %d students.\n",
                    code, this.courseName.get(code), this.semester.get(code), this.session.get(code), this.creditHours.get(code), this.studentCount.get(code)
            );
        }
        System.out.println();
    }
}
