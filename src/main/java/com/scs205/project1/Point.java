package com.scs205.project1;

public class Point {

    protected double x;
    protected double y;

    public Point (){
    }

    public Point(double inputX, double inputY) {
        this.x = inputX;
        this.y = inputY;
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

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double i) {
        x = x + i;
    }

    public void shiftY(double i) {
        y = y + i;
    }

    public double distance(Point point2) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = point2.x;
        double y2 = point2.y;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void rotate(double v) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = x1 * Math.cos(v) - y1 * Math.sin(v);
        double y2 = x1 * Math.sin(v) + y1 * Math.cos(v);
        this.x = x2;
        this.y = y2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append('}');
        return sb.toString();
    }
}
