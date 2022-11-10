package l3q1;
import java.util.Scanner;
public class L3Q1 {

   public static void main(String[] args) {
     Scanner cs = new Scanner (System.in);
     
     int num1, num2;
     int a,b,c,d,e = 0;
       System.out.println("Enter two numbers:");
       num1 = cs.nextInt();
       num2 = cs.nextInt();
       
       System.out.println("Enter the operand:");
       String abc = cs.next();
       char operand = abc.charAt(0); //Question want String.charAt(0) so we have to declare one string first and use it to declare a char for operand
       
       if (operand == '+'){
           a = num1 + num2;
           System.out.println("The sum is: " + a);}
       else if (operand == '-'){
           b = num1 - num2;
           System.out.println("The difference is: " + b);}
       else if (operand == '*'){
           c = num1*num2;
           System.out.println("The multiplication is:" + c);}
       else if (operand == '/'){
           d = num1/num2;
           System.out.println("The quotient is: " + d);}
       else if (operand == '%'){
           e = num1%num2;
           System.out.println("The remainder is: " + e);}
       else 
           System.out.println("There is no solution for this operand");
           }  
    }
    

