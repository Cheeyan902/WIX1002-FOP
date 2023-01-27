package l10q4;

import java.io.*;
import java.time.LocalDateTime;

public class Appointment implements Searchable{
    
    public void book(String dateStartTime, String dateEndTime){
        
         try {
             
            FileWriter file = new FileWriter("C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q4\\appointment.txt", true);
            String appointment = String.format("%s,%s\n", dateStartTime, dateEndTime);
            if (this.search(dateStartTime, dateEndTime)) {
                file.write(appointment);
                System.out.println("Appointment is available.");
            }
            else {
                System.out.println("Appointment is not available.!");
            }
            
            file.close();
            
        }catch(IOException e){ 
            System.out.printf("Problem with file input"); 
        }
    }
    
    @Override
    public boolean search(String dateStartTime, String dateEndTime){
        
        boolean isAvailable = true;
        
        try {
            
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q4\\appointment.txt"));
            String line = "";
            while ((line = file.readLine()) != null) {  
                if(!this.noCrash(dateStartTime, dateEndTime, line)){
                    isAvailable = false; 
                    break; 
                }
            }
            
            file.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found"); }
        catch(IOException e){
            System.out.println("Problem with file input."); 
        }
        return isAvailable;
    }
    
    private boolean noCrash(String dateStartTime, String dateEndTime, String fileTime) {
        String start = fileTime.split(",")[0], end = fileTime.split(",")[1];
        LocalDateTime date_start = LocalDateTime.of(
                Integer.parseInt(dateStartTime.substring(4, 8)), Integer.parseInt(dateStartTime.substring(2, 4)), Integer.parseInt(dateStartTime.substring(0, 2)),
                Integer.parseInt(dateStartTime.substring(9)), 0, 0
        );
        LocalDateTime date_end = LocalDateTime.of(
                Integer.parseInt(dateEndTime.substring(4, 8)), Integer.parseInt(dateEndTime.substring(2, 4)), Integer.parseInt(dateEndTime.substring(0, 2)),
                Integer.parseInt(dateEndTime.substring(9)), 0, 0
        );
        LocalDateTime line_start = LocalDateTime.of(
                Integer.parseInt(start.substring(4, 8)), Integer.parseInt(start.substring(2, 4)), Integer.parseInt(start.substring(0, 2)),
                Integer.parseInt(start.substring(9)), 0, 0
        );
        LocalDateTime line_end = LocalDateTime.of(
                Integer.parseInt(end.substring(4, 8)), Integer.parseInt(end.substring(2, 4)), Integer.parseInt(end.substring(0, 2)),
                Integer.parseInt(end.substring(9)), 0, 0
        );
        return date_end.isBefore(line_start) || date_start.isAfter(line_end);
    }
}
