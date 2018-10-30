package com.netcracker.main;

import com.netcracker.first.*;
import com.netcracker.second.*;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Ball ball = new Ball(5,8, 1, 3, 45);
        Container cont = new Container(0,0,12,18);
        for(int i = 0; i <= 200; i++) {
            ball.move();
            System.out.println(ball);
            if(cont.collidesWidth(ball) & cont.collidesHeight(ball)) {
                ball.move();
                System.out.println(ball);
            }
            if(!cont.collidesWidth(ball)) {
                System.out.println("Strike X");
                ball.reflectHorizontal();
            }
            if(!cont.collidesHeight(ball)) {
                System.out.println("Strike Y");
                ball.reflectVertical();
            }
            ball.move();
            System.out.println(ball);

        }

/*
        Author[] a = new Author[3];
        a[0] = new Author("name1", "email1", 'm');
        a[1] = new Author("name2", "email2", 'f');
        a[2] = new Author("name3", "email3", 'f');


        String str = Arrays.toString(a);
        str = str.substring(1, str.length()-1);
        System.out.println(str);

        Book book = new Book("bookName", a, 125.0);
        System.out.println(book.getAuthorNames());
        System.out.println(book);

        MyPoint point = new MyPoint(2,3);
        System.out.println(point.distance(6,7));
        MyPoint point2 = new MyPoint(6,7);
        System.out.println(point.distance(point2));
        System.out.println(point2.distance());

        MyTriangle tri = new MyTriangle(1,1,2,4,4,1);
        System.out.println(tri.getType());

        MyComplex complex = new MyComplex(1.0, 3.0);
        MyComplex complex2 = new MyComplex(3.0, 4.0);
        System.out.println(complex.equals(complex2));
        System.out.println(complex.argument());

        System.out.println(complex.conjugate());

        MyPolynominal pol1 = new MyPolynominal(1,2,3);
        System.out.println(pol1.evaluate(2));
        MyPolynominal pol2 = new MyPolynominal(1,2,3,4);
        System.out.println(pol1.add(pol2));
        pol1.multiply(pol2);
        System.out.println(pol1.multiply(pol2));
*/
    }
}
