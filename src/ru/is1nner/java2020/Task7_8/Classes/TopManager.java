package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.Employee;
import ru.is1nner.java2020.Task7_8.EmployeePosition;

public class TopManager extends Employee implements EmployeePosition  {
    public TopManager(String Name, String LastName) {
        super(Name, LastName);
    }
    public double calcTopManagerSalary(double fullIncome, double baseSalary) {
        if (fullIncome > 10000000) {
            return baseSalary + 1.5 * baseSalary;
        } else return baseSalary;

    }


    @Override
    public int getIncome()
    {
        return 0;
    }


    @Override
    public String getJobTitle()
    {
        return "TopManager";
    }


    @Override
    public double calcSalary(double fullIncome, double baseSalary)
    {
        return calcTopManagerSalary(fullIncome, baseSalary);
    }
}