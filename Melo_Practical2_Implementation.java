/*
 * Programmer: Jose Melo
 * Program: Practical 2
 * Purpose: A program that determines whether a specified dot ('x', 'y') falls inside, overlaps, or is a point inside a circle
 * Date 10/23 - 10/24/2025
 */

public class Melo_Practical2_Implementation{
//Tester provided
 public static void main(String[] args) {

   Circle2D c1 = new Circle2D(2, 2, 5.5);

   System.out.println("Area is " + c1.getArea());

   System.out.println("Perimeter is " + c1.getPerimeter());

   System.out.println(c1.contains(3, 3));

   System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));

   System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

 }

}

//Create class Circle2D
class Circle2D {
    private double x;
    private double y;
    private double radius;

    //Call x, y, and radius values from the tester
    public Circle2D(){
      this(0,0,1);
    }
    //Assign each x, y, and radius values to it's own value inside class Circle2D
    public Circle2D(double x, double y, double radius){
      this.x = x;
      this.y = y;
      this.radius = radius;
    }

    //Get x value
    public double getX (){
      return x;
    } 
    
    //Get y value
    public double getY (){
      return y;
    }

    //Get radius value
    public double getRadius (){
      return radius;
    }
    
    //Method to calculate the area of the circle
    //pi * r^2
    public double getArea(){
      double calc;
      calc = Math.PI * (Math.pow(radius, 2));
      return calc;
    }
    //Method to calculate the perimeter of the circle.
    //2 * pi * r
    public double getPerimeter(){
      double calc;
      calc = 2 * Math.PI * radius;
      return calc;
      
    }

    //Method to determine true or false if point (x,y) is inside circle.
    //sqrt((x - h)^2 + (y - k)^2)
    public boolean contains(double x, double y){
      double calc;
       calc = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow (y - this.y, 2));
       return calc <= radius;
    }
    
    //Method to determine true or false if circle is inside pre-made circle
    //sqrt((circle.x - x)^2 + (circle.y - y)^2)
    public boolean contains(Circle2D circle) {
        double calc;
        calc = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return calc + circle.radius <= this.radius;
    }
    
    //Method to determine true or false if circle overlaps pre-made circle
    //sqrt((circle.x - x)^2 + (circle.y - y)^2)
    public boolean overlaps (Circle2D circle){
      double calc;
      calc = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
      return calc < (this.radius + circle.radius) && calc < Math.abs (this.radius - circle.radius);
    }
}


