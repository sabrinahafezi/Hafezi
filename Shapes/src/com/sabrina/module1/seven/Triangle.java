package com.sabrina.module1.seven;
public class Triangle extends TwoDShape implements Rotate {

    /**
     * Member variables to keep track of the side lengths
     */
    protected double side1;
    protected double side2;
    protected double side3;

    /**
     * Default constructor
     */
    public Triangle(){
        super(0.0,0.0, Colour.NONE);
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
    }

    /**
     * Overloaded (with altered argument list) constructor
     * Calculates height of the triangle using Heron's Method
     */
    public Triangle(double sd1, double sd2, double sd3, Colour c){
        super(0.0,0.0, c);
        side1 = sd1;
        side2 = sd2;
        side3 = sd3;
        width = side2;
        heronsHeight();

    }

    /**
     * Calculates height of the triangle using Heron's Method
     */
    private void heronsHeight()
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        height = (2 * area) / side2;
    }

    /**
     * @return The height of the triangle
     */
    private double getHeronsHeight()
    {
        return(height);
    }

    /**
     * @return The area of the triangle
     */
    public double getArea()
    {
        return(0.5 * width * height);
    }


    /**
     * @return The area of the shape as a string
     */
    public String toString() {
        return("Area: " + getArea());

    }

    /**
     * Member variables to rotate a triangle
     */
    public double angle;
    public void rotate90(){
        angle += 90;
    }
    public void rotate180(){
        angle += 180;
    }
    public void rotate(double degree){
        angle += degree;
    }

}

