package ru.is1nner.java2020.Task9;
import ru.is1nner.java2020.Task3.Hand;
public class MainTask {
    public static void main(String[] args) {
        Company company = new Company();
        company.doThings(new Handleimployees() {


            @Override
            public void doEverything(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doThings(employee -> employee.setPhoneNumber(89150553395L));
        letsDoSomeThings handle = new letsDoSomeThings();
        company.doThings(handle);
    }
}

class letsDoSomeThings implements Handleimployees {


    @Override
    public void doEverything(Employee employee) {
        employee.setName("Ilya");
    }
}