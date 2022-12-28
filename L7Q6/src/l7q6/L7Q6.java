package l7q6;

import java.util.*;
import java.io.*;
public class L7Q6 {

    public static void main(String[] args) {
        
        double price = 0;
        
        try{
            System.out.printf("%-10s%19s%19s%19s%19s\n","ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            Scanner product = new Scanner(new FileInputStream("product.txt"));
            Scanner order = new Scanner(new FileInputStream("order.txt"));
            
            String [][] productinput = new String [7][]; // product.txt is in 5 row and 3 columns where column1 = productID, column2 = productname, column3 = productprice
            
            for(int i =0; i<7; i++){
                productinput [i] = product.nextLine().split(","); //split the contents in product.txt by row with ,
            }
            
            while(order.hasNextLine()){
                String [] orderinput = order.nextLine().split(",");
                for(int i =0; i<productinput.length; i++){
                    if(orderinput[1].equalsIgnoreCase(productinput[i][0])){
                        price = Integer.parseInt(orderinput[2]) * Double.parseDouble(productinput[i][2]);
                        System.out.printf("%-10s %-28s %4s %20s %20.2f\n", productinput[i][0], productinput[i][1], orderinput[2], productinput[i][2], price);
                }
            }
        }
            product.close();
            order.close();
            
            }catch(IOException e){
            System.out.println("Problem with file input.");
            } 
    }
}
