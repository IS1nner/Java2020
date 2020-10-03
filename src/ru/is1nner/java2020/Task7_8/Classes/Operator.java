package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.Employee;
import ru.is1nner.java2020.Task7_8.EmployeePosition;

public class Operator extends Employee implements EmployeePosition {
    public Operator(String Name, String LastName)
    {
        super(Name, LastName);
    }


    @Override
    public int getIncome()
    {
        return 0;
    }


    @Override
    public String getJobTitle()
    {
        return "Operator";
    }


    @Override
    public double calcSalary(double fullIncome, double baseSalary)
    {
        return baseSalary;
    }
}