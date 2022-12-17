package l6q3;

import java.util.Scanner;
import java.util.Arrays;
public class L6Q3 {

    public static void main(String[] args) {
        
        int [] num = new int [10];
        
        displayarray(num);
        System.out.println("Array before reversing: " + Arrays.toString(num));
        displayreverse(num);
        System.out.println("Array after reversing: " + Arrays.toString(num));
    }
    
    public static void displayarray(int[] num){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        for(int i=0; i<num.length; i++){
            num[i]= cs.nextInt();
        }
    }
    
    public static void displayreverse(int[] num){
        for(int i=0; i<num.length/2; i++){
          int temp = num[i];
          num[i] = num[num.length - 1 - i];
          num[num.length - 1 - i] = temp;     
        }
    }
}
