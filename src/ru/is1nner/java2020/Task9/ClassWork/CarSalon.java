package ru.is1nner.java2020.Task9.ClassWork;
import java.util.ArrayList;
public class CarSalon {
    private ArrayList<Car> cars = new ArrayList<>();
    public void  addCar(Car car)
    {
        cars.add(car);
    }
    public void printSomeCars(Car car){
    }


    @Override
    public String toString() {
        return "CarSalon{" +
                "cars=" + cars +
                '}';
    }
}