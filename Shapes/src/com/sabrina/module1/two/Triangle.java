package com.sabrina.module1.two;
public class Triangle extends TwoDShape {

    protected double side1;
    protected double side2;
    protected double side3;


    public Triangle(){
        super(0.0,0.0);
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
    }


    public Triangle(double sd1, double sd2, double sd3){
        super(0.0,0.0);
        side1 = sd1;
        side2 = sd2;
        side3 = sd3;
        width = side2;
        heronsHeight();

    }

    private void heronsHeight()
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        height = (2 * area) / side2;
    }


    private double getHeronsHeight()
    {
        return(height);
    }


    public double getArea()
    {
        return(0.5 * width * height);
    }



    public String toString() {
        return("Area: " + getArea());

    }

}

