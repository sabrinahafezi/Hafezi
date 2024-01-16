package com.sabrina.module2.one;

public class PlanetTypeTest {
    public static void main(String[] args) {

        PlanetType pt1 = new PlanetType("Rock");
        PlanetType pt2 = new PlanetType("Gas");
        PlanetType pt3 = new PlanetType("Gas");


        Planet p1 = new Planet("Earth", 3.5, 1, pt1);
        Planet p2 = new Planet("Jupiter", 5.5, 3, pt2);
        Planet p3 = new Planet("Jupiter", 4.5, 3, pt3);
        /**
         * Two planets both called Jupiter meaning they have the same hashcode (hashcode buckets sorted only by designation)
         * They are different planets since they have different masses
         */


        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1 is equal to p2: " + p1.equals(p2));
        System.out.println("p2 is equal to p3: " + p2.equals(p3));


        System.out.println("p1 hashcode: " + p1.hashCode());
        System.out.println("p2 hashcode: " + p2.hashCode());
        System.out.println("p3 hashcode: " + p3.hashCode());


    }
}