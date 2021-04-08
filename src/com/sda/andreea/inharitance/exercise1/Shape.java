package com.sda.andreea.inharitance.exercise1;

public class Shape {
    private int area;
    private int perimeter;

    public Shape(int area, int perimeter){
        this.area = area;
        this.perimeter = perimeter;

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
