package l9q1_shape;

import java.util.Scanner;

public class Square extends Shape{
    
    protected double side;
    
    public Square(){
        super("Square");
        this.input();
        this.compute();
    }
    
    public void input(){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the length of side: ");
        this.side = cs.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 4 * this.side;
        this.area = 2 * this.side;
    }
}
