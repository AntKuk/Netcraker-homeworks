package com.netcracker.first;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] pointArray = {x, y};
        return pointArray;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String str = new String("(" + x + "," + y + ")");
        return str;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow((double)this.x - (double)x, 2) + Math.pow((double)this.y - (double)y, 2));
        return distance;
    }

    public double distance(MyPoint another) {
        double distance = Math.sqrt(Math.pow((double)this.x - (double)another.getX(), 2) + Math.pow((double)this.y - (double)another.getY(), 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow((double)this.x, 2) + Math.pow((double)this.y, 2));
        return distance;
    }


}
