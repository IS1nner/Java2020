package ru.is1nner.java2020.Task9.ClassWork;
public class MainClass {
    public static void main(String[] args) {
        CarSalon salon = new CarSalon();
        for (int i = 0; i < 100; i++) {
            salon.addCar(new Car("BMW", "320i", (int) (Math.random() % 5  +2000), Math.random()%1000+5));
        }
    }
}