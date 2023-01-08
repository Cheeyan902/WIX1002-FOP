package l8q1_number;

public class L8Q1_Number {
    
    public static void main(String[] args) {
       
        //Test constructors
        Number arry = new Number (5); //declare a new class and call it from other file with main class Number
        
        //Test methods
        arry.displayAll(); //method call from the object of new class
        arry.displayEven();
        arry.displayPrime();
        arry.displayMax();
        arry.displayMin();
        arry.displayAvg();
        arry.displaySqr();
    }
}


