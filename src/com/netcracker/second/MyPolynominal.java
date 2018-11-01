package com.netcracker.second;

import java.util.Arrays;

public class MyPolynominal {
    private double[] coeffs;

    public MyPolynominal(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        String str = new String ();
        for(int i = coeffs.length-1; i >= 0; i--) {
            if(i != 0) {
                str += coeffs[i] + "x^" + i + "+";
            }
            else {
                str += coeffs[i];
            }
        }

        return str;
    }

    public double evaluate (double x) {
        double value = 0.0;
        for(int i = coeffs.length-1; i >= 0; i--) {
            if(i != 0) {
                value += coeffs[i] * Math.pow(x, i);
            }
            else {
                value += coeffs[i];
            }
        }

        return value;
    }

    public MyPolynominal add(MyPolynominal right) {
        int maxIndex, subIndex;
        double[] result;
        if(this.coeffs.length > right.coeffs.length) {
            maxIndex = this.getDegree();
            subIndex = right.getDegree();
            result = new double[maxIndex+1];
            for (int i = 0; i <= maxIndex; i++) {
                if(i <= subIndex) {
                    result[i] = this.coeffs[i] + right.coeffs[i];
                }
                else {
                    result[i] = this.coeffs[i];
                }
            }
        }

        else {
            maxIndex = right.getDegree();
            subIndex = this.getDegree();
            result = new double[maxIndex+1];
            for (int i = 0; i <= maxIndex; i++) {
                if(i <= subIndex) {
                    result[i] = this.coeffs[i] + right.coeffs[i];
                }
                else {
                    result[i] = right.coeffs[i];
                }
            }
        }
        return new MyPolynominal(result);
    }

    public MyPolynominal multiply(MyPolynominal right) {
        double[][] subTable = new double[this.coeffs.length][right.coeffs.length];
        double[][] resTable = new double[this.coeffs.length][this.coeffs.length+right.coeffs.length-1];
        double[] result = new double[resTable[0].length];

        for(int i = 0; i <= this.coeffs.length-1; i++) {
            for(int j = 0; j <= right.coeffs.length-1; j++) {
                subTable[i][j] = this.coeffs[i]*right.coeffs[j];
            }
        }

        int y = 0;

        for(int i = 0; i <= subTable.length-1; i++) {

            //for(int j = 0; j <= right.coeffs.length-1; j++) {
            for(int j = 0; j <= subTable[0].length-1; j++) {
                if(i >=1) {
                    resTable[i][j+y] = subTable[i][j];
                }
                else {
                    resTable[i][j] = subTable[i][j];
                }
            }
            y++;
        }


        for(int i = 0; i <= resTable[0].length-1; i++) {
            double value = 0.0;
            for(int j = 0; j <= resTable.length-1; j++) {
                value += resTable[j][i];
            }
            result[i] = value;
        }

        return new MyPolynominal(result);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof MyPolynominal)) {
            return false;
        }

        MyPolynominal pol = (MyPolynominal) obj;

        boolean result = Arrays.equals(pol.coeffs, this.coeffs);
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (double d : coeffs) {
            long longD = Double.doubleToLongBits(d);
            result = 31 * result + (int)(longD ^ (longD >>> 32));
        }

        return result;
    }


}
