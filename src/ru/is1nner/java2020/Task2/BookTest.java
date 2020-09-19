package ru.is1nner.java2020.Task2;
public class BookTest {
    public static void main(String[] args) {
        Book D1 = new Book("Jack Sparrow",200 ,20 );
        Book D2 = new Book("Kolobok",100 ,10 );
        System.out.println(D1);
        System.out.println(D2);
        D1.intoDiscount();
        D2.intoDiscount();
    }
}
