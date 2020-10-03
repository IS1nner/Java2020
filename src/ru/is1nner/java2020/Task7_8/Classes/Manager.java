package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.Employee;
import ru.is1nner.java2020.Task7_8.EmployeePosition;
import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    Random Random = new Random();
    private double Income = Random.nextInt(25000) + 115000;

    public Manager(String Name, String LastName)
    {
        super(Name, LastName);
    }
    public int getIncome()
    {
        return (int) Income;
    }


    @Override
    public String getJobTitle()
    {
        return "Manager";
    }


    @Override
    public double calcSalary(double fullIncome, double baseSalary)
    {
        return baseSalary+0.05* Income;
    }

}