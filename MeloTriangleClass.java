/*
 * Programmer: Jose Melo
 * Purpose:
 * Program: Triangle Class Chp 11
 * Date: 10/29/2025
 */

//Tester
public class MeloTriangleClass{
public static void main(String[] args) {
    Triangle triangle = new Triangle(1, 1.5, 1);
    triangle.setColor("yellow");
    triangle.setFilled(true);
    System.out.println(triangle);
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is " + triangle.getPerimeter());
    System.out.println(triangle);
    }
}

//Geometric Object class - that was provided
class GeometricObject {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;


 /** Construct a default geometric object */
public GeometricObject() {
    dateCreated = new java.util.Date();
    }

 /** Construct a geometric object with the specified color and filled value */
public GeometricObject(String color, boolean filled) {
  dateCreated = new java.util.Date();
  this.color = color;
  this.filled = filled;
    }
 /** Return color */
public String getColor() {
    return color;
    }
 /** Set a new color */
public void setColor(String color) {
    this.color = color;
    }
 /** Return filled. Since filled is boolean, its get method is named isFilled */
public boolean isFilled() {
    return filled;
    }

/** Set a new filled */
public void setFilled(boolean filled) {
    this.filled = filled;
    }
/** Get dateCreated */
public java.util.Date getDateCreated() {
    return dateCreated;
    }
 

/** Return a string representation of this object */
public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}



//Create class Triangle that extends from Geometric Object class.
class Triangle extends GeometricObject {
    //Create variabls side1, side2 and side3.
    private double side1;
    private double side2;
    private double side3;

    //Non - argument constructor
    public Triangle (){

    }
    //Argument Constructor to pull side1, side2, and side3
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //Method to get side1 variable
    public double getSide1 (){
        return side1;
    }
    //Method to get side2 variable.
    public double getSide2(){
        return side2;
    }
    //Method to get side3 variable.
    public double getSide3(){
        return side3;
    }

    //Equation and process used: find semi-perimeter and then apply it to Heron's formula
    //Method to calculate the area of a triangle based on the side lengths.
    public double getArea (){
        double area;
        double semiPerimeter;

        semiPerimeter = (side1 + side2+ side3) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        return area;
    }
    //Method to calculate the perimeter of a triangle based on the side lengths.
    public double getPerimeter (){
        double perimeter;
        perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    //Method to create the sentence that outputs the size of each side of the triangle.
    public String toString(){
        String output;
        output = ("Triangle: side1 = " + side1 + " side 2 = " + side2 + " side3 = " + side3);
        return output;
    }


}