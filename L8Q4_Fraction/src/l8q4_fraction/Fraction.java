package l8q4_fraction;

import java.util.Scanner;
public class Fraction {
    
    //Instance variables
    private int numerator;
    private int denominator;
   
    //Constructors
    public Fraction(){
        
        Scanner cs = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        this.numerator = cs.nextInt();
        System.out.print("Enter the denominator: ");
        this.denominator = cs.nextInt();
        
    }
    
    //Methods
    
    //Mutator
    public void setnumerator(int numerator){
        this.numerator = numerator;
    }
    
    public void setdenominator(int denominator){
        this.denominator = denominator;
    }
    
    //Accessor
    public int getnumerator(){
        return numerator;
    }
    
    public int getdenominator(){
        return denominator;
    }
    
    public void displayReduced(){
        System.out.printf("The reduced fraction is %d/%d.", (this.numerator/ getGCD(this.numerator,this.denominator)),(this.denominator/ getGCD(this.numerator,this.denominator)));
    }
    
    private int getGCD(int a, int b){
        int temp = Math.max(a,b) % Math.min(a, b);
        a= Math.min(a, b);
        b = temp;
        if(b==0){
            return a;
        }
        return getGCD(a,b);
    }
}
