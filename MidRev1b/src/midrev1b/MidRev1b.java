package midrev1b;

import java.util.Scanner;
public class MidRev1b {

    public static void main(String[] args) {
       Scanner cs = new Scanner (System.in);
       
       double [] sum = new double [4];
       String[] typedurian = {"MK", "HL","D24","UM","Quit"};
       double total=0;
       
       for(int i=0; i<typedurian.length; i++){
           System.out.print("Enter the type of durian [Quit] to terminate: ");
           String s = cs.next();
           if(s.equals(typedurian[0]))
               sum[0]=25*262.8;
           if(s.equals(typedurian[1]))
               sum[1]=22*325.6;
           if(s.equals(typedurian[2]))
               sum[2]=20*204.5;
           if(s.equals(typedurian[3]))
               sum[3]=18*121.5;
           total+=sum[i];
           if(s.equals(typedurian[4]))
               break;
           System.out.print("Enter the sales in kg: ");
           switch(typedurian[i]){
               case "MK" -> System.out.println("262.8");
               case "HL" -> System.out.println("325.6");
               case "D24" -> System.out.println("204.5");
               case "UM" -> System.out.println("121.5");
           }    
          }
          System.out.printf("Total Sales: %.2f", total);
       }
    }
