package com.netcracker.first;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {}

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double area = 0.0;
        area = (double)length * (double)width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 0.0;
        perimeter = 2 * ((double)length + (double)width);
        return perimeter;
    }

    @Override
    public String toString() {
        String str = new String ("Rectangle[length=" + length + ",width=" + width + "]");
        return str;
    }
}
