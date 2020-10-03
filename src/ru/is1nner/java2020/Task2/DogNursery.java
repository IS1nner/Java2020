package ru.is1nner.java2020.Task2;

public class DogNursery {
    int count = 10;
    int last = 0;
    Dog[] dogs = new Dog[count];

    public void addDog(Dog dog) {
        dogs[last] = dog;
        last++;
    }

    public Dog[] getDogsList() {
        System.out.println("Nursery");
        return dogs;
    }
}