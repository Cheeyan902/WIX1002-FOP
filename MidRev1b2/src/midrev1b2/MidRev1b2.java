package midrev1b2;

import java.util.Scanner;
public class MidRev1b2 {

    public static void main(String[] args) {
       Scanner cs = new Scanner(System.in);
       
       double total =0;
       double sum = 0;
       for(int i=0; i<5; i++){
           System.out.print("Enter the type of durian [Quit] to terminate: ");
           String a = cs.next();
           if(a.equals("Quit"))
               break;
           System.out.print("Enter the sales in kg: ");
           switch(a){
               case "MK" -> {System.out.println("262.8"); 
               total=262.8*25;}
               case "HL" -> {System.out.println("325.6");
               total=325.6*22;}
               case "D24" -> {System.out.println("204.5");
               total=204.5*20;}
               case "UM" ->{ System.out.println("121.5");
               total=121.5*18;}
           }
           sum+=total;
       }
        System.out.println("Total sales : " + sum);
    }
    
}
