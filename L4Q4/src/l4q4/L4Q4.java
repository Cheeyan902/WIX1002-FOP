package l4q4;

import java.util.Scanner;
public class L4Q4 {
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int d1ofyear;
        int d1ofMay, d1ofAugest;
        int year;
        
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        System.out.print("Enter the first day of year: ");
        d1ofyear = sc.nextInt();
        
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is leap year");
            d1ofMay = d1ofyear + 1 + 1;
        }
        else{
            System.out.println(year + " is not a leap year");          
            d1ofMay = d1ofyear + 1;
        }
        d1ofMay %= 7;
        System.out.println("");
        
        
        System.out.println("\tMay of " + year);
        System.out.println("--------------------------");
        System.out.println("  S  M  T  W  T  F  S  ");
        
        //for space
        int day = 1;
        for(int i = 1; i<d1ofMay + 33 - 1; i++){
           if(i %7 == 1){
               System.out.println();
           }
           if(i <= d1ofMay){
               System.out.print("   ");
           }
           else{
               if(day/10 == 0){
                   System.out.print("  " + day);
               }
               else{
                   System.out.print(" " + day);
               }
             day++;
             }                  
           }
        
        d1ofAugest = d1ofMay + 2;
        d1ofAugest %= 7;
        System.out.println("\n\n\tAugest of " + year);
        System.out.println("--------------------------");
        System.out.println("  S  M  T  W  T  F  S  ");
        
        int day2 = 1;
        for(int i = 1; i<d1ofAugest + 32 - 1; i++){
           if(i %7 == 1){
               System.out.println();
           }
           if(i < d1ofAugest){
               System.out.print("   ");
           }
           else{
               if(day2/10 == 0){
                   System.out.print("  " + day2);
               }
               else{
                   System.out.print(" " + day2);
               }
             day2++;
             }
                          
           }
    }
}
       
       
 


