package com.netcracker.second;

import com.netcracker.second.Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collidesWidth(Ball ball) {
        if((ball.getX() + ball.getRadius()) >= this.x2) {
            return false;
        }
        if((ball.getX() - ball.getRadius()) <= this.getX()) {
            return false;
        }

        return true;
    }

    public boolean collidesHeight(Ball ball) {
        if((ball.getY() + ball.getRadius()) >= (float)this.y2) {
            return false;
        }
        if((ball.getY() - ball.getRadius()) <= (float)this.getY()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String str = new String("Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]");
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Container)) {
            return false;
        }

        Container container = (Container) obj;

        boolean result = container.x1 == this.x2 & container.y1 == this.y1 & container.x2 == this.x2 & container.y2 == this.y2;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;

        return result;
    }
}
