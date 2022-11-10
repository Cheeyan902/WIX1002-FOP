package l3q6;

import java.util.Scanner;
public class L3Q6 {
   
    public static void main(String[] args) {
      Scanner cs = new Scanner (System.in);
      
      double radius,distance;
      int x,y;
      
        System.out.println("Enter a value for radius of a circle: ");
        radius = cs.nextDouble();
        System.out.println("Enter a value for coordinate x: ");
        x = cs.nextInt();
        System.out.println("Enter a value for coordinate y: ");
        y = cs.nextInt();
               
        distance = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
        System.out.printf("The distance from point(x,y) to center point is: %.2f", distance);
        System.out.println("");
        
        if (distance>radius)
            System.out.println("The point"+ '(' + x +"," + y + ')' + " is outside the circle centered at (0,0).");
        else if (distance<= radius)
            System.out.println("The point"+ '(' + x +"," + y + ')' + " is inside the circle centered at (0,0).");
        
    }
    
}
