package ru.is1nner.java2020.Task7_8;
import java.util.ArrayList;
import java.util.List;

public class Company {
    double Income;
    ArrayList<Employee> employeePositions;
    public Company(){
        employeePositions = new ArrayList<>();
    }
    public void hire(Employee employee){
        employeePositions.add(employee);
        Income += employee.getPos().getPribil();
    }
    public void hireAll(ArrayList<Employee> employees){
        employeePositions.addAll(employees);
        for (Employee emp:employees
        ) {
            Income +=emp.getPos().getPribil();
        }
    }
    List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> employeesCopy;
        if (count > employeePositions.size()) {
            return null;
        } else {
            employeesCopy = new ArrayList<>();
            employeesCopy.addAll(employeePositions);
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1; j++) {
                    if (employeesCopy.get(j).getPos().
                            getSalary() < employeesCopy.get(j + 1).
                            getPos().
                            getSalary()) {


                        Employee EmplT = employeesCopy.
                                get(j);
                        employeesCopy.set(j, employeesCopy.get(j + 1));
                        employeesCopy.set(j + 1, EmplT);
                    }

                }
            }
        }
        return employeesCopy.subList(0,count);
    }

    List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> employeesCopy;
        if (count > employeePositions.size()) {
            return null;
        } else {
            employeesCopy = new ArrayList<>();
            employeesCopy.addAll(employeePositions);
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1; j++) {
                    if (employeesCopy.get(j).getPos().
                            getSalary() > employeesCopy.get(j + 1).
                            getPos().
                            getSalary()) {


                        Employee EmplT = employeesCopy.
                                get(j);
                        employeesCopy.set(j, employeesCopy.get(j + 1));
                        employeesCopy.set(j + 1, EmplT);
                    }

                }
            }
        }
        return employeesCopy.subList(0,count - 1);
    }
    public double getIncome(){
        return Income;
    }
    public void fire(Employee emp){
        employeePositions.remove(emp);
    }
    public void fire(int index){
        employeePositions.remove(index);
    }
    public void printAll(){
        for (Employee e:employeePositions
        ) {
            System.out.println(e.Name + " " + e.LastName + " Position: "+ e.getPos().getJobTitle() + " Base salary = " +  e.getBaseSalary() + " Salary = " + e.getPos().getSalary());
        }
    }
    public int getEmployersCount(){
        return employeePositions.size();
    }
}