package com.sabrina.module1.seven;

public abstract class TwoDShape {

    /**
     * Member variables to keep track of the width, height, and colour
     */
    protected double width;
    protected double height;
    protected Colour colour;

    /**
     * Default constructor
     */
    public TwoDShape(Colour c){
        width = 0.0;
        height = 0.0;
        colour = c;
    }

    /**
     * Overloaded (with altered argument list) constructor
     */
    public TwoDShape(double w, double h, Colour c){
        width = w;
        height = h;
        colour = c;
    }


    /**
     * @param w The width of the shape
     */
    public void setWidth(double w)
    {
        width = w;
    }

    /**
     * @return The width of the shape
     */
    public double getWidth()
    {
        return(width);
    }

    /**
     * @param h The height of the shape
     */
    public void setHeight(double h)
    {
        height = h;
    }

    /**
     * @return The height of the shape
     */
    public double getHeight()
    {
        return(height);
    }

    /**
     * @return The area of the shape
     */
    public double getArea()
    {
        return(width * height);
    }

    public enum Colour {
        RED,
        GREEN,
        BLUE,
        NONE

    }
}
