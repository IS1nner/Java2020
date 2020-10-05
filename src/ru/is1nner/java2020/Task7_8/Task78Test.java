package ru.is1nner.java2020.Task7_8;
import ru.is1nner.java2020.Task7_8.Classes.Manager;
import ru.is1nner.java2020.Task7_8.Classes.Operator;
import ru.is1nner.java2020.Task7_8.Classes.TopManager;
public class Task78Test {
    public static void main(String args[]) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            Employee operator = new Employee(String.valueOf(i), "Alex", 34000, new Operator());
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee operator = new Employee(String.valueOf(i), "Bob", 80000, new Manager());
            company.hire(operator);
        }
        for (int i = 0; i < 10; i++) {
            Employee operator = new Employee(String.valueOf(i), "Steve", 90000, new TopManager(company));
            company.hire(operator);
        }
        company.printAll();
        int i = 1;
        System.out.println("TOP 15");
        for(Employee e  : company.getTopSalaryStaff(15)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        i = 1;
        System.out.println("LOW 30");
        for(Employee e  : company.getLowestSalaryStaff(30)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        for (int j = 0; i < company.getEmployersCount() / 2; j++){
            company.fire(0);
        }
        i = 1;
        System.out.println("TOP 10");
        for(Employee e  : company.getTopSalaryStaff(10)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        i = 1;
        System.out.println("LOW 30");
        for(Employee e  : company.getLowestSalaryStaff(30)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
    }
}