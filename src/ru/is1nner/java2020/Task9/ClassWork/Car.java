package ru.is1nner.java2020.Task9.ClassWork;
public class Car {
    private final String Brand;
    private final String Model;
    private final int Year;
    private double Mileage;

    public Car(String brand, String model, int year, double mileage) {
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.Mileage = mileage;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }


    public double getMileage() {
        return Mileage;
    }

    public void setMileage(double mileage) {
        this.Mileage = mileage;
    }
}