package ru.is1nner.java2020.Task7_8.Classes;
import ru.is1nner.java2020.Task7_8.Company;
import ru.is1nner.java2020.Task7_8.EmployeePosition;
import java.util.Random;
public class TopManager implements EmployeePosition {
    String jobName;
    Company Cmp;
    double salary;
    int Pribil;
    public TopManager(Company c) {
        this.jobName = "Top manager";
        Cmp = c;
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
        return salary;
    }
    @Override
    public double calcSalary(double baseSalary){

        if(Cmp.getIncome() > 10000000) {
            salary = baseSalary + (Pribil * 1.5);
            return salary;
        }
        else {
            return baseSalary;
        }
    }
}