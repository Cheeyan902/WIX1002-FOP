package l9q2_personprofile;

public class Tester {

    public static void main(String[] args) {
       
        //Test Constructor 
        Student abc = new Student ("Rosy", 'F', "02-09-2003", "course.txt");
        Lecturer cde = new Lecturer("John", 'M', "25-11-2003", "lecturer.txt");
        
        //Test Methods
        abc.displayDetails();
        cde.displayDetails();
    }
    
}
