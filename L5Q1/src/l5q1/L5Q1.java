package l5q1;

import java.util.Arrays;
import java.util.Scanner;
public class L5Q1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        
        int min= 100, max = 0;
        int sum = 0;
        
        System.out.print("Enter n numbers of students: ");
        int students = cs.nextInt();
        
        int [] scores = new int [students];
        
        for(int i =0; i<scores.length; i++){
           scores[i] = (int)(Math.random()*101);
           if(scores[i]>max)
               max = scores[i];
           if(scores[i]<min)
               min = scores[i];
           sum += scores[i];
        }
        
        double average = (double)(sum/students);
        System.out.println("The scores of students are: " + Arrays.toString(scores));
        System.out.println("The highest score is: " + max);
        System.out.println("The lowest score is: " + min);
        System.out.printf("The average of scores is: %.2f", average);
        
    }
    
}
