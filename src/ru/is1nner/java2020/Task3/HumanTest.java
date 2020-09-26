package ru.is1nner.java2020.Task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("mikhail", "dickov", 20,
                new Head("brown", "black", 2),
                new Hand(44),
                new Leg(44));
        System.out.println("1) " + human + "\n");
        human.setHead(new Head("brown", "light", 1));
        human.setSurname("litvinov");
        human.setLeg(new Leg(41));
        System.out.println("2) " + human + "\n");
        human.getHead().setHairColor("green");
        System.out.println("3) " + human);
    }
}