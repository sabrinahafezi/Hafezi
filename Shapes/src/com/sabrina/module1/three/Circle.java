package com.sabrina.module1.three;

public class Circle extends TwoDShape {

    public final static double PI = 3.14159;

    private double radius;


    public Circle(){
        radius = 0.0;
    }


    public Circle(double r){
        radius = r;
    }


    public void setRadius(double r)
    {
        radius = r;
    }


    public double getRadius()
    {
        return(radius);
    }


    public double getArea()
    {
        return(PI * Math.pow(radius, 2));
    }


    public String toString() {
        return("Area: " + getArea());

    }
}