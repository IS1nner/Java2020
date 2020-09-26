package ru.is1nner.java2020.Task5;

public class Circle extends Shape {
    protected double radius = 0.;
    protected static final double PI = 3.1415926;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return PI * Math.sqrt(radius);
    }

    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}