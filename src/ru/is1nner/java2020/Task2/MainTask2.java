package ru.is1nner.java2020.Task2;

public class MainTask2 {

        public static void main(String[] args) {
            Shape shape = new Shape(12, "Dick");
            int count = shape.getSidesCnt();
            System.out.println(count);
            shape.setSidesCnt(45);
            System.out.println(shape.getSidesCnt());
            System.out.println(shape);
        }
    }