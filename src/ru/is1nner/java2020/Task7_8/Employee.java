package ru.is1nner.java2020.Task7_8;

abstract public class Employee implements EmployeePosition {
    private String LastName;
    private String Name;
    public Employee(String name, String LastName)
    {
        this.LastName = LastName;
        this.Name = name;
    }
    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String lastName)
    {
        this.LastName = lastName;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    abstract public int getIncome();


    @Override
    public String toString() {
        return  Name + ' ' + LastName + "  (" + getJobTitle() + ")" ;
    }
}