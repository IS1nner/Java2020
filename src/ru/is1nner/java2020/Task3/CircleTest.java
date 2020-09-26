package ru.is1nner.java2020.Task3;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Original radius: " + circle.getRadius());

        circle.setRadius(15);
        System.out.println("New radius: " + circle.getRadius());
    }
}