package l7q6b;

import java.util.*;
import java.io.*;
public class L7Q6b {

    public static void main(String[] args) {
        
        String line = "";
        String[] linecontent = new String[3];
        
        try{
            //print the headline first
            System.out.printf("%-10s%19s%19s%19s%19s\n","ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            
            BufferedReader product = new BufferedReader(new FileReader("product.txt"));
            BufferedReader order = new BufferedReader(new FileReader("order.txt"));
            
            LinkedHashMap <String,String> dataname = new LinkedHashMap <>();
            LinkedHashMap <String,Double> dataprice = new LinkedHashMap <>();
            LinkedHashMap <String,String> dataorderID = new LinkedHashMap <>();
            LinkedHashMap <String,Integer> dataquantity = new LinkedHashMap <>();
            
            //declare a string line to represent the content streamed from output file(product.txt)
            line = product.readLine();
            //loop continues when there is still have a content in output file
            while(line != null){
                //split the content in output file with , for each row
                linecontent = line.split(",");
                dataname.put(linecontent[0], linecontent[1]); //set linecontent[0] which is product id as key/reference that contains value linecontent[1] which is product name
                dataprice.put(linecontent[0],Double.parseDouble(linecontent[2])); //set linecontent[0] as key for value linecontent[2] which is product price
                
                line = product.readLine(); //readline again to ensure the loop will continue running
            }
            
            //declare a string line to represent the content streamed from output file(order.txt)
            line = order.readLine();
            
            while(line != null){
                //split the content in output file with , for each row
                linecontent = line.split(",");
                dataorderID.put(linecontent[0], linecontent[1]); //set linecontent[0], orderid as key for value linecontent[1], productid
                dataquantity.put(linecontent[1],Integer.parseInt(linecontent[2])); //set linecontent[1] as key for value linecontent[2], orderquantity
                
                line = order.readLine(); //readline again to ensure loop will continue running
            }
            
            //after linking all contents with its reference and in a pair
            //start declare a string and put dataorderID as keyset so all things will refer to orderID
           for(String orderinput: dataorderID.keySet()){
               System.out.printf("%-10s %-28s %4d %20.2f %20.2f\n", 
                      dataorderID.get(orderinput), //get productid from dataorderID.get with key: orderinput since orderid = productid
                      dataname.get(dataorderID.get(orderinput)), //get productname from dataname.get with key which is dataorderID.get(orderinput) cuz everything should refer to orderid
                      dataquantity.get(dataorderID.get(orderinput)),
                      dataprice.get(dataorderID.get(orderinput)),
                      dataquantity.get(dataorderID.get(orderinput)) * dataprice.get(dataorderID.get(orderinput)) //total can be obtained by multiple dataquantity with dataprice and using dataorderID.get(orderinput) as key
               );     
           }
           
            product.close();
            order.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
    }
}
