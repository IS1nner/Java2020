package ru.is1nner.java2020.Task3;

public class Hand {
    private double length;

    public Hand(double length) {
        if (length <= 0) {
            throw new IllegalStateException("Length of hand is <= 0");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand {" +
                "length=" + length +
                '}';
    }
}