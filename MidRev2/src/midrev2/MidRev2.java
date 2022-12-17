package midrev2;

import java.util.Scanner;
import java.util.Random;
public class MidRev2 {

    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        Random r = new Random();
        
        int N;
        System.out.print("Enter the number of staff [N]: ");
        N = cs.nextInt();
            
        int [] staffid = new int [N];
        
        int j = 0;
        for(int i=0; i<staffid.length; i++){
            staffid[i] = r.nextInt(10000,100000);
            System.out.println("Staff ID : " + staffid[i]);
            if((staffid[i]/10)%2==0 && (staffid[i]/1000)%2!=0){
                System.out.println("Weekend Duty");
                j=j+1;}
                else 
                System.out.println("Weekend off");
        }
        System.out.println("The number of staffs work during weekend is " + j);
    }
    
}
