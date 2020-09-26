package ru.is1nner.java2020.Task3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }
}