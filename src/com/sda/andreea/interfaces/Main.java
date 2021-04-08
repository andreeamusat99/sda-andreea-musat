package com.sda.andreea.interfaces;

public class Main {
    public static void main(String[] args)
    {
        /*// Invalid code - interface cannot be instantiated
        Shape myShape = new Shape();*/

        Rectangle myRectangle = new Rectangle(4, 5);
        System.out.println(myRectangle.getArea());

        Shape myShape = myRectangle;
        // Calling Rectangle#getPerimeter implementation.
        System.out.println(myShape.getPerimeter());

        // prints "Shape: " + myRectangle#toString methods value
        myRectangle.print();
    }
}


