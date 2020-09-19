package ru.is1nner.java2020.Task2;
public class Dog {
    public String Name;
    public int Age;
    public Dog() {}

    public Dog(int a) {
        Age = a;
    }

    public Dog(String n) {
        Name = n;
    }

    public Dog(String n, int a) {
        Age = a;
        Name = n;
    }

    public String toString() {
        return this.Name +"; age = " + this.Age;
    }

    public void intoHumanAge() {
        System.out.println(Name + "'s real human age = " + Age * 7 + " years");
    }
}