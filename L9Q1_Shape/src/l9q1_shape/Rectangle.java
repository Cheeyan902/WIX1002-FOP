package l9q1_shape;

import java.util.Scanner;

public class Rectangle extends Shape{
        
       protected double side1, side2;
       
       //Constructor
       public Rectangle(){
            super("Rectangle");
            this.inputlength(); //call method back and transfer to shape class
            this.compute();
       }
    
       public void inputlength(){
           Scanner cs = new Scanner(System.in);
           System.out.print("Enter the length of side1: ");
           this.side1 = cs.nextDouble();
           System.out.print("Enter the length of side2: ");
           this.side2 = cs.nextDouble();
       }
       
       public void compute(){
           this.perimeter = 2*(this.side1 + this.side2);
           this.area = this.side1 * this.side2;
       }
}
