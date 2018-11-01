package com.netcracker.second;


public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        String str;
        if(imag >= 0) {
            str = new String ("(" + real + "+" + imag + "i)");
        }
        else {
            str = new String ("(" + real + imag + "i)");
        }

        return str;
    }

    public boolean isReal() {
        if(real != 0.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isImaginary() {
        if(imag != 0.0) {
            return true;
        }
        else {
            return false;
        }
    }


    public boolean equals(double real, double imag) {
        if(this.real == real & this.imag == imag) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(MyComplex another) {
        if(this == another) {
            return true;
        }
        if(another == null) {
            return false;
        }
        if(this.real == another.real & this.imag == another.imag) {
            return true;
        }
        else {
            return false;
        }
    }

    public double magnitude() {
        double magnitude = Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
        return magnitude;
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;

        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        MyComplex newComplex = new MyComplex(newReal, newImag);
        return newComplex;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;

        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double newReal = this.real - right.real;
        double newImag = this.imag - right.imag;
        MyComplex newComplex = new MyComplex(newReal, newImag);
        return newComplex;
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = this.real*right.real - this.imag*right.imag;
        double newImag = this.real*right.imag + this.imag*right.real;

        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double newReal = (this.real*right.real + this.imag*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double newImag = (this.imag*right.real - this.real*right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2));

        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex(this.real, -this.imag);
        return newComplex;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof MyComplex)) {
            return false;
        }

        MyComplex complex = (MyComplex) obj;

        boolean result = complex.real == this.real & complex.imag == this.imag;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longReal = Double.doubleToLongBits(real);
        long longImag = Double.doubleToLongBits(imag);
        result = 31 * result + (int)(longReal ^ (longReal >>> 32));
        result = 31 * result + (int)(longImag ^ (longImag >>> 32));

        return result;
    }

}
