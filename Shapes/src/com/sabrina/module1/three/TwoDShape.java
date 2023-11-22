package com.sabrina.module1.three;

public abstract class TwoDShape {

    protected double width;
    protected double height;


    public TwoDShape(){
        width = 0.0;
        height = 0.0;
    }


    public TwoDShape(double w, double h){
        width = w;
        height = h;
    }


    public void setWidth(double w)
    {
        width = w;
    }


    public double getWidth()
    {
        return(width);
    }

    public void setHeight(double h)
    {
        height = h;
    }

    public double getHeight()
    {
        return(height);
    }


    public double getArea()
    {
        return(width * height);
    }

}
