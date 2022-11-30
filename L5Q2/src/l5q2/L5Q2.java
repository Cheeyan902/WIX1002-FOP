package l5q2;

import java.util.Arrays;
public class L5Q2 {

    public static void main(String[] args) {
        
       int[]nums = new int [10];
       boolean[]checker = new boolean [21];
       
       for(int i=0; i<nums.length; i++){
           int random = (int)(Math.random()*21);
           if(!checker[random])
               checker[random] = true;
           else{
               do{
                   random = (int)(Math.random()*21);
               }while(checker[random]);
           checker[random]=true;
       } 
        nums[i] = random;
    }
    
       Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));
  }
}
