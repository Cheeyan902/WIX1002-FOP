package l5q5;

import java.util.Scanner;
import java.util.Random;
public class L5Q5 {
 
    public static void main(String[] args) {
        Random r = new Random();
        
        int [] numbers = new int [20];
        
        System.out.println("A list of 20 random integers within 0 to 100: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i]=r.nextInt(101);
            System.out.print(numbers[i] + ", ");
        }
        //Bubble Sort
        for(int pass=1; pass < numbers.length; pass++) //pass always equal to length-1 if start with int i = 0
            for(int i=0; i < numbers.length-1; i++) //put numbers.length-1 because bubble sort always need +1 when compare num[1] with num[1+1]
                if(numbers[i]<numbers[i+1])
                {
                    int temp = numbers[i];
                    numbers [i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
        
        System.out.println("\nArray in descending order: ");
        for(int i =0; i<numbers.length-1; i++)
            System.out.print(numbers[i] + ", ");
        System.out.println(numbers[numbers.length-1]); //or no need this line and set i<numbers.length
        
        //Linear Search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchkey = sc.nextInt();
        int loop =0;
        boolean isfound = false;
        for(int i =0; i<numbers.length; i++ ){
            if(numbers[i] == searchkey){
                isfound = true;
                System.out.println(searchkey + " found");
                break;
          }
            loop++;
        }
        if(!isfound)
          System.out.println("Not found");
        System.out.printf("Linear Search - %d loop(s)\n", loop);
        
        //Binary Search
        loop = 0;
        isfound = false;
        int low = 0;
        int high = numbers.length-1;
        
        while(low<=high){
            loop++;
            int middle = (low+high)/2;
            if(searchkey == numbers[middle]){
                isfound = true;
                 System.out.println(searchkey + " found");
            break;
            }
            else if(searchkey < numbers[middle]) //ascending if searchkey<numbers[middle] then low=middle+1 first, if descending and searchkey<numbers[middle] then high=middle-1 first
                low = middle + 1;
            else
                high = middle - 1;
        }
            if(!isfound)
                System.out.println("Not found");
            System.out.printf("Binary Search - %d loop(s)\n", loop);
     }
  }
    