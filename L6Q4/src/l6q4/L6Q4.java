package l6q4;

public class L6Q4 {

    public static void main(String[] args){
        
          L6Q4 cs = new L6Q4();
          
          System.out.println(cs.getGCD(24,8));
          System.out.println(cs.getGCD(200,625));
    }
    
    int getGCD(int i, int j){
        
        L6Q4 cs = new L6Q4();
        int temp = 0;
        
        if(j>i){
            temp = i;
            i = j;
            j = temp;} //arrange big until small ( , )
        
        temp = i%j;
        i = j;
        j = temp;      //check whether can fully divided or not 
        
        if(j == 0){
            return i;}
        
        return cs.getGCD(i,j);
    }

    
}
