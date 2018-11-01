package com.netcracker.main;

import com.netcracker.first.*;
import com.netcracker.second.*;


public class Main {

    public static void main(String[] args) {

        // Testing Ball and Container classes

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

        System.out.println();

        // Testing Author and Book classes

        Author[] a = new Author[3];
        a[0] = new Author("AuthorName1", "email1", 'm');
        a[1] = new Author("AuthorName2", "email1", 'f');
        a[2] = new Author("AuthorName3", "email3", 'f');

        System.out.println("Authors equals-->" + a[0].equals(a[1]));
        System.out.println("Author hashCodes-->" + a[0].hashCode() + " " + a[1].hashCode());

        Book book = new Book("bookName", a, 125.0);
        Book book2 = new Book("bookName", a, 125.0);
        System.out.println("Book authors-->" + book.getAuthorNames());
        System.out.println(book);
        System.out.println("Books equals-->" + book.equals(book2));
        System.out.println("Book hashCodes-->" + book.hashCode() +  " " + book2.hashCode());

        System.out.println();

        // Testing MyPoint and Triangle classes

        MyPoint point = new MyPoint(2,3);
        System.out.println(point.distance(6,7));
        MyPoint point2 = new MyPoint(6,7);
        System.out.println("Distance between points-->" + point.distance(point2));
        System.out.println("Distance between point and (0,0)-->" + point2.distance());

        MyTriangle tri = new MyTriangle(1,1,2,4,4,1);
        System.out.println("Triangle type-->" + tri.getType());
        MyTriangle tr = new MyTriangle(0,0,0.5,(Math.sqrt(3))/2, 1,0);
        System.out.println("Triangle type-->" + tr.getType());

        System.out.println();

        // Testing MyComplex class

        MyComplex complex = new MyComplex(1.0, 3.0);
        MyComplex complex2 = new MyComplex(3.0, 4.0);
        System.out.println("Complexes equals-->" + complex.equals(complex2));
        System.out.println("Complex arg-->" + complex.argument());

        System.out.println("Complex conj-->" + complex.conjugate());

        System.out.println();

        // Testing MyPolynominal class

        MyPolynominal pol1 = new MyPolynominal(1,2,3);
        System.out.println("Polynom evaluates-->" + pol1.evaluate(2));
        MyPolynominal pol2 = new MyPolynominal(1,2,3,4);
        System.out.println("Polynoms add-->" + pol1.add(pol2));

        System.out.println("Polynoms multiply-->" + pol1.multiply(pol2));



    }
}
