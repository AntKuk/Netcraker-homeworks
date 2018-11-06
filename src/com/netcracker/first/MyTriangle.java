package com.netcracker.first;

import com.netcracker.first.MyPointDouble;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyTriangle {
    private MyPointDouble v1;
    private MyPointDouble v2;
    private MyPointDouble v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPointDouble(x1, y1);
        this.v2 = new MyPointDouble(x2, y2);
        this.v3 = new MyPointDouble(x3, y3);
    }

    public MyTriangle(MyPointDouble v1, MyPointDouble v2, MyPointDouble v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        String str = new String("MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]");
        return str;
    }

    public double getPerimeter() {
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String getType() {
        String TriangleType = new String();

        if((new BigDecimal(v1.distance(v2)).setScale(2, RoundingMode.UP)).equals( (new BigDecimal(v2.distance(v3)).setScale(2, RoundingMode.UP)))
                & (new BigDecimal(v2.distance(v3)).setScale(2, RoundingMode.UP)) .equals( (new BigDecimal(v3.distance(v1)).setScale(2, RoundingMode.UP)))) {
            TriangleType = "Equilateral";
            return TriangleType;
        }
        else if(v1.distance(v2) == v2.distance(v3) | v2.distance(v3) == v3.distance(v1) | v3.distance(v1) == v1.distance(v2)) {
            TriangleType = "Isosceles";
        }
        else TriangleType = "Scalene";
        return TriangleType;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }
        if(!(obj instanceof MyTriangle)) {
            return false;
        }

        MyTriangle triangle = (MyTriangle) obj;

        boolean result = triangle.v1.equals(this.v1) & triangle.v2.equals(this.v2) & triangle.v3.equals(this.v3);
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();

        return result;
    }

}
