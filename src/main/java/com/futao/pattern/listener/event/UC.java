package com.futao.pattern.listener.event;

/**
 * @author futao
 * @date 2020/5/1
 */
public class UC {
    private double x;
    private double y;

    @Override
    public String toString() {
        return "UC{" +
                "x=" + x +
                ", y=" + y +
                '}';
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
}
