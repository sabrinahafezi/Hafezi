package com.sabrina.module1.one;

public class Circle extends TwoDShape {

    /**
     * Member variable to establish the value of pi (final variable)
     */
    public final static double PI = 3.14159;


    /**
     * Member variable to keep track of the radius
     */
    private double radius;

    /**
     * Default constructor
     */
    public Circle(){
        super(Colour.NONE);
        radius = 0.0;
    }

    /**
     * Overloaded (with altered argument list) constructor
     */
    public Circle(Colour c, double r){
        super(c);
        radius = r;
    }

    /**
     * @param r The radius of the circle
     */
    public void setRadius(double r)
    {
        radius = r;
    }


    /**
     * @return The radius of the circle
     */
    public double getRadius()
    {
        return(radius);
    }

    /**
     * @return The area of the circle
     */
    public double getArea()
    {
        return(PI * Math.pow(radius, 2));
    }

    /**
     * @return The area of the circle as a string
     */
    @Override
    public String toString() {
        return("Area: " + getArea());

    }
}