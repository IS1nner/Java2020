package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.EmployeePosition;
import java.util.Random;
public class Manager implements EmployeePosition {
    protected String jobName;
    double Salary;
    int Pribil;
    public Manager(){
        this.jobName= "Manager";
        Random rand = new Random();
        Pribil = 115000 + rand.nextInt() % 140000;
    }
    public int getPribil(){
        return Pribil;
    }
    @Override
    public String getJobTitle() {
        return jobName;
    }
    public double getSalary() {
        return Salary;
    }
    @Override
    public double calcSalary(double baseSalary) {
        Salary = baseSalary + (Pribil * 1.5);
        return Salary;
    }
}