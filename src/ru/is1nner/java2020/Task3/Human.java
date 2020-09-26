package ru.is1nner.java2020.Task3;

public class Human {
    private String name;
    private String surname;
    private int age;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(String name, String surname, int age, Head head, Hand hand, Leg leg) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Human: " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", \nhead = " + head +
                ", \nhand = " + hand +
                ", \nleg = " + leg;
    }
}