package l3q5;

import java.util.Scanner;
public class L3Q5 {
  
    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        
        int a,b,c,d,e,f,x,y;
       
        System.out.println("Enter a number for a: ");
        a = cs.nextInt();
        System.out.println("Enter a number for b: ");
        b = cs.nextInt();
        System.out.println("Enter a number for c: ");
        c = cs.nextInt();
        System.out.println("Enter a number for d: ");
        d = cs.nextInt();
        System.out.println("Enter a number for e: ");
        e = cs.nextInt();
        System.out.println("Enter a number for f: ");
        f = cs.nextInt();
        
        if(((a*d)-(b*c))==0){
            System.out.println("The equation has no solution.");
            System.exit(0);//put System.exit(0) to stop program from being executed if result == 0
        }
        
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("The reuslt for x:" + x);
        System.out.println("The reuslt for y:" + y);
              
    }
    
}
