package com.sda.andreea.abstraction;

public abstract class Shape {

    private int numberOfSides;

    public Shape(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public abstract int getArea();
    public abstract int getPerimeter();

    public int getNumberOfSides() {
        return numberOfSides;
    }
}

