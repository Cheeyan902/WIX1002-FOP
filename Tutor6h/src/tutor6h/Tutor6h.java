package tutor6h;

import java.util.*;
public class Tutor6h {

   
    public static void main(String[] args) {
        Random g = new Random ();
        
        int num = g.nextInt(11);
        int twice = displayRandomNumber(num);
        System.out.printf("The first random number that generated twice is %d\n",twice);}
    
    public static int displayRandomNumber(int num){
        Random g = new Random ();
        Set<Integer> generatedNumber = new HashSet<Integer>();//use method Set<type of obj> name = new HashSet<type of obj>() to store the generated number
        System.out.println("a"+num);

        do{
           generatedNumber.add(num);
           System.out.println(generatedNumber);
           num = g.nextInt(11);
        }while(!generatedNumber.contains(num));
        
        System.out.println(num);
        
        return num;
    }
    
}
