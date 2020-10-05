package ru.is1nner.java2020.Task7_8;
public class Employee {
        String LastName;
        String Name;
        double BaseSalary;
        EmployeePosition Pos;

        public Employee(String sourname, String name, double baseSalary, EmployeePosition pos) {
                this.LastName = sourname;
                this.Name = name;
                this.BaseSalary = baseSalary;
                this.Pos = pos;
                pos.calcSalary(baseSalary);
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                this.Name = name;
        }

        public double getBaseSalary() {
                return BaseSalary;
        }

        public void setBaseSalary(double baseSalary) {
                this.BaseSalary = baseSalary;
        }

        public EmployeePosition getPos() {
                return Pos;
        }

        public void setPos(EmployeePosition pos) {
                this.Pos = pos;
        }

        public String getLastName() {
                return LastName;
        }

        public void setLastName(String lastName) {
                this.LastName = lastName;
        }
}