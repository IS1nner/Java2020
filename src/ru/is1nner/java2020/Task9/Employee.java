package ru.is1nner.java2020.Task9;
import java.time.LocalDate;
public class Employee {
    private String Name;
    private String LastName;
    private final LocalDate BirthDate;
    private String RegPlace;
    private long PhoneNumber;
    private double Salary;

    public Employee(String name, String surname, LocalDate birthDate, String regPlace, int phoneNumber, double salary) {
        this.Name = name;
        this.LastName = surname;
        this.BirthDate = birthDate;
        this.RegPlace = regPlace;
        this.PhoneNumber = phoneNumber;
        this.Salary = salary;

    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public String getRegPlace() {
        return RegPlace;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public double getSalary() {
        return Salary;
    }
}