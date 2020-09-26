package ru.is1nner.java2020.Task3;

public class Head {
    private String eyeColor;
    private String hairColor;
    private int earSize;

    public Head(String eyeColor, String hairColor, int earSize) {
        if (earSize <= 0) {
            throw new IllegalStateException("Ear size is <= 0");
        }
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.earSize = earSize;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return "Head {" +
                "eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", earSize=" + earSize +
                '}';
    }
}