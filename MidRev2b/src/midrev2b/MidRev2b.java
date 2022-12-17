package midrev2b;

import java.util.Scanner;
public class MidRev2b {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
       int x,y;
       boolean z;
       int i = 0;
       int j = 0;
       do{
        System.out.print("Enter a number (-1 to quit) : ");
        x = cs.nextInt();
        if(x==-1)
            break;
        System.out.print("Enter a factor : ");
        y = cs.nextInt();
        System.out.print(y + " is a factor of " + x + "? (true/false) : " );
        if(x%y==0){
            z = true;
        System.out.println(z);
        System.out.println("Your answer is correct.");
        i++;
        }
        else {
            z = false;
            System.out.println(z);
            System.out.println("Your answer is incorrect.");        
        }
       j++;
       }while(x!=-1);
           
        System.out.println("Your final score is " + i + "/" + j);  
    }
}
