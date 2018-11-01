package com.netcracker.first;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String str = new String("Circle[radius=" + radius + ",color=" + color + "]");
        return str;
    }

    public double getArea() {
        double area = 0.0;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) obj;

        boolean result = circle.radius ==this.radius & circle.color.equals(this.color);
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longRadius = Double.doubleToLongBits(radius);
        result = 31 * result + (int)(longRadius ^ (longRadius >>> 32));
        result = 31 * result + color.hashCode();

        return result;
    }

}
