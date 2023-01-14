package l9q1_shape;

import java.util.Scanner;

public class Circle extends Shape{
    
    protected double diameter;
    
    public Circle(){
        super("Circle");
        this.input();
        this.compute();
    }
    
    public void input(){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        this.diameter = cs.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 2* Math.PI * (this.diameter/2);
        this.area = Math.PI * (Math.pow((this.diameter/2),2));
    }
}
