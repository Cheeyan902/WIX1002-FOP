package l8q6_burger;

public class Burger {
    
    //Instance variables
    private final String STALL; //use private final because stall is linked with object alr (fixed)
    private int TOTALSALEDAY;
    private static int TOTALSALEALLDAY = 0; //add static to allow us to call method by using class
    
    //Constructors
    public Burger(String STALL){
        this.STALL = STALL;
    }
    
    //Methods
    public void numbersold(int a){
        if(a>0){
        this.TOTALSALEDAY += a;
        TOTALSALEALLDAY += this.TOTALSALEDAY;
        }
    }
    
     public String getName(){
        return this.STALL;
    }

     public int getTOTALSALEDAY(){
         return this.TOTALSALEDAY;
     }
     
     public static int getTOTALSALEALLDAY(){
         return TOTALSALEALLDAY; //public + static allow us to use class as object to call method
     }
}