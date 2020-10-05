package ru.is1nner.java2020.Task9;
import java.util.ArrayList;
public class Company{
    ArrayList<Employee> Employees = new ArrayList<Employee>();
    public void hire(Employee employee){
        Employees.add(employee);
    }
    public void fire(int index_emp_to_fire) {
        Employees.remove(index_emp_to_fire);
    }

    public void doThings(Handleimployees handle){
        for (int i = 0; i < Employees.size(); i++) {
            handle.doEverything(Employees.get(i));
        }

    }
}