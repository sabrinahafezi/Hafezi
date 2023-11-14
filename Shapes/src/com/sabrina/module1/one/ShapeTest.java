package com.sabrina.module1.one;
public class ShapeTest {
    public static void main(String[] args) {

        /*
         * Creating a Triangle object with side lengths 3.0, 4.0, and 5.0, and setting its color to red
         * Printing the area of the Triangle using the getArea() method
         */
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, TwoDShape.Colour.RED);
        System.out.println("Triangle Area: " + triangle.getArea());

        /*
         * Creating a Circle object with radius 3.0 and setting its color to green
         * Printing the area of the Circle using the getArea() method
         */
        Circle circle = new Circle(TwoDShape.Colour.GREEN,3.0);
        System.out.println("Circle Area: " + circle.getArea());

    }
}
