package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.EmployeePosition;
import java.util.Random;
public class Operator implements EmployeePosition {
    String jobName;
    double Salary;
    public Operator() {
        jobName = "Operator";
    }

    @Override
    public String getJobTitle() {
        return jobName;
    }

    public double getSalary() {
        return Salary;
    }
    public int getPribil(){
        return 0;
    }
    @Override
    public double calcSalary(double baseSalary) {
        Random rand = new Random();
        Salary = baseSalary + ((115000 + rand.nextInt() % 140000) * 1.5);
        return baseSalary;
    }
}