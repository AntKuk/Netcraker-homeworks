package com.netcracker.third;
import com.netcracker.third.Dog;

import java.util.Random;


public class CtrlStruct {
    static {
        System.out.println();
        System.out.println("tasks for control structures");
        System.out.println();
    }

    public CtrlStruct() {
        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt(11);
        }
    }

    private Dog dog = Dog.Schnauzer;

    int[] array = new int[50];


    public void enumIfElse() {
        if(dog == Dog.Terrier) {
            System.out.println("Dog is a terrier");
        }
        else if(dog == Dog.Akita) {
            System.out.println("Dog is an akita");
        }
        else if(dog == Dog.Husky) {
            System.out.println("Dog is a husky");
        }
        else if(dog == Dog.Schnauzer) {
            System.out.println("Dog is a schnauzer");
        }
        else if(dog == Dog.Retriever) {
            System.out.println("Dog is a retriever");
        }
    }

    public void enumSwitchCase() {
        switch (dog) {
            case Terrier: System.out.println("Dog is a Terrier"); break;
            case Akita: System.out.println("Dog is an Akita"); break;
            case Husky: System.out.println("Dog is a Husky"); break;
            case Schnauzer: System.out.println("Dog is a Schnauzer"); break;
            case Retriever: System.out.println("Dog is a Retriever"); break;
        }
    }

    public void arrIfElse() {
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;

        System.out.println("arrIfElse");

        for(int i : array) {
            if(i == 0) {
                System.out.println("Number is 0");
                ++n0;
            }
            else if(i == 1) {
                System.out.println("Number is 1");
                ++n1;
            }
            else if(i == 2) {
                System.out.println("Number is 2");
                ++n2;
            }
            else if(i == 3) {
                System.out.println("Number is 3");
                ++n3;
            }
            else if(i == 4) {
                System.out.println("Number is 4");
                ++n4;
            }
            else if(i == 5) {
                System.out.println("Number is 5");
                ++n5;
            }
            else if(i == 6) {
                System.out.println("Number is 6");
                ++n6;
            }
            else if(i == 7) {
                System.out.println("Number is 7");
                ++n7;
            }
            else if(i == 8) {
                System.out.println("Number is 8");
                ++n8;
            }
            else if(i == 9) {
                System.out.println("Number is 9");
                ++n9;
            }
            else if(i == 10) {
                System.out.println("Number is 10");
                ++n10;
            }
        }

        System.out.println("Ammount of #0-->" + n0);
        System.out.println("Ammount of #1-->" + n1);
        System.out.println("Ammount of #2-->" + n2);
        System.out.println("Ammount of #3-->" + n3);
        System.out.println("Ammount of #4-->" + n4);
        System.out.println("Ammount of #5-->" + n5);
        System.out.println("Ammount of #6-->" + n6);
        System.out.println("Ammount of #7-->" + n7);
        System.out.println("Ammount of #8-->" + n8);
        System.out.println("Ammount of #9-->" + n9);
        System.out.println("Ammount of #10-->" + n10);


    }

    public void arrSwitchCase() {
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        System.out.println("arrSwitchCase");

        for(int i : array) {
            switch (i) {
                case 0: {
                    System.out.println("Number is 0");
                    ++n0;
                    break;
                }
                case 1: {
                    System.out.println("Number is 1");
                    ++n1;
                    break;
                }
                case 2: {
                    System.out.println("Number is 2");
                    ++n2;
                    break;
                }
                case 3: {
                    System.out.println("Number is 3");
                    ++n3;
                    break;
                }
                case 4: {
                    System.out.println("Number is 4");
                    ++n4;
                    break;
                }
                case 5: {
                    System.out.println("Number is 5");
                    ++n5;
                    break;
                }
                case 6: {
                    System.out.println("Number is 6");
                    ++n6;
                    break;
                }
                case 7: {
                    System.out.println("Number is 7");
                    ++n7;
                    break;
                }
                case 8: {
                    System.out.println("Number is 8");
                    ++n8;
                    break;
                }
                case 9: {
                    System.out.println("Number is 9");
                    ++n9;
                    break;
                }
                case  10: {
                    System.out.println("Number is 10");
                    ++n10;
                    break;
                }
            }

        }

        System.out.println("Ammount of #0-->" + n0);
        System.out.println("Ammount of #1-->" + n1);
        System.out.println("Ammount of #2-->" + n2);
        System.out.println("Ammount of #3-->" + n3);
        System.out.println("Ammount of #4-->" + n4);
        System.out.println("Ammount of #5-->" + n5);
        System.out.println("Ammount of #6-->" + n6);
        System.out.println("Ammount of #7-->" + n7);
        System.out.println("Ammount of #8-->" + n8);
        System.out.println("Ammount of #9-->" + n9);
        System.out.println("Ammount of #10-->" + n10);


    }

}
