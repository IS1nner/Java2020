package ru.is1nner.java2020.Task2;
public class DogTest {
    public static void main(String[] args) {
        Dog D1 = new Dog("Bobik",1);
        Dog D2 = new Dog("Lelik",5);
        Dog D3 = new Dog("Snejok",2);
        System.out.println(D1);
        System.out.println(D2);
        System.out.println(D3);
        D1.intoHumanAge();
        D2.intoHumanAge();
        D3.intoHumanAge();
    }
}