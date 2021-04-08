package com.sda.andreea.abstraction;

import java.util.Random;

public class Rectangle extends  Shape {

    public static final int NUMBER_OF_SIDES = 4;

    private  int width;
    private int height;

    public Rectangle(int width, int height){
        super(NUMBER_OF_SIDES);
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea(){
        return width * height;
    }
    @Override
    public int getPerimeter(){
        return 2 * (width + height);
    }
}
