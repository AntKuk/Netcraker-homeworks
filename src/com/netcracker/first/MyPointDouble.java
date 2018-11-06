package com.netcracker.first;

public class MyPointDouble {
    private double x = 0.0;
    private double y = 0.0;

    public MyPointDouble() {}

    public MyPointDouble(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] pointArray = {x, y};
        return pointArray;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String str = new String("(" + x + "," + y + ")");
        return str;
    }

    public double distance(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance;
    }

    public double distance(MyPointDouble another) {
        double distance = Math.sqrt(Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distance;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }
        if(!(obj instanceof MyPointDouble)) {
            return false;
        }

        MyPointDouble point = (MyPointDouble) obj;

        boolean result = point.x == this.x & point.y == this.y;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longX = Double.doubleToLongBits(x);
        long longY = Double.doubleToLongBits(y);
        result = 31 * result + (int)(longX ^ (longX >>> 32));
        result = 31 * result + (int)(longY ^ (longY >>> 32));

        return result;
    }


}
