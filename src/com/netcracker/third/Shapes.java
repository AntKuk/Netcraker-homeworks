package com.netcracker.third;

public class Shapes {
    static {
        System.out.println();
        System.out.println("tasks for nested loops");
        System.out.println();
    }

    public void drawRectangle() {
        int size = 5;
        for(int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++) {
                System.out.print("# ");
                if(col == size) {
                    System.out.println();
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawTriangle() {
        int size = 8;
        int col = 8;

        //Fig b
        for(int row = 1; row <= size; row++) {
           for(int i = col; i >= 1; i--) {
               System.out.print("# ");
               if(i == 1) {
                   System.out.println();
               }
           }
            System.out.println();
           col--;
        }

        System.out.println();
        col = 1;
        //Fig a
        for(int row = 1; row <= size; row++) {
            for(int i = 1; i <= col; i++) {
                System.out.print("# ");
                if(i == col) {
                    System.out.println();
                }
            }
            System.out.println();
            col++;
        }

        System.out.println();
        //Fig e
        for(int row = 1; row <= size; row++) {
            for(int i = 1; i <= size; i++) {
                if(row == 1 | row == 8) {
                    System.out.print("# ");
                    if(i == size) {
                        System.out.println();
                    }
                    continue;
                }

                if(i == 1) {
                    System.out.print("# ");
                }
                else if(i == size) {
                    System.out.println("#");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
