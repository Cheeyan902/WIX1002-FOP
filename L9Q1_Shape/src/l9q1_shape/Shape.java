package l9q1_shape;

public class Shape {
    
   protected String name;
   protected double perimeter, area;
   
   //Constructor
   public Shape(String name){
       this.name = name;
   }
   
   //Methods
   public void setPerimeter(double perimeter){
       this.perimeter = perimeter;
   }
   
   public void setArea(double area){
       this.area = area;
   }
   
   public double getPerimeter(){
       return this.perimeter;
   }
   
   public double getArea(){
       return this.area;
   }
   
   public void display(){
       System.out.printf("Name of shape: %s, Perimeter: %.2f, Area: %.2f\n", this.name, this.perimeter, this.area);
       System.out.println();
   }
}
