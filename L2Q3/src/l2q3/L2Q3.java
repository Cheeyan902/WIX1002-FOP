package l2q3;
import java.util.Random;
public class L2Q3 {

   public static void main(String[] args) {
    Random abc = new Random();
    
    double total = 0, average;
    int MAX = 40;
    double[] List = new double [3];
       System.out.println("Three random numbers are:");
    
    for (int i=0; i<3; i++){
        List[i]= abc.nextDouble(MAX)+10;
        System.out.printf("%6.2f",List[i]);
        total+=List[i];
    }
   average = total/3;
       System.out.printf("\nTotal is: %6.2f",total);
       System.out.printf("\nAverage is: %6.2f",average);
   
    }
    
}
