package ru.is1nner.java2020;

public class Main {

    public static void main(String[] arguements) {

        // Zadanie 3(1)

        int[] array = {1, 2, 3, 4, 5};
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        summa = 0;

        // Zadanie 3(2)

        int[] array2 = {1, 2, 3, 4, 5};
        int i = 0;
        while (summa < 15) {
            summa = summa + array2[i];
        }
        summa = 0;

        //Zadanie 3(3)

        i = 0;
        int[] array3 = {1, 2, 3, 4, 5};
        do {
            summa = summa + array3[i];
        }
        while (summa != 15);
        System.out.println(" ");
        System.out.println("TASK #3");
        System.out.println(" ");
        System.out.println(summa);
        System.out.println(" ");
        System.out.println("TASK #4");
        System.out.println(" ");

        //Zadanie 4

        for (i = 0; i < arguements.length; i++)
            System.out.println(arguements[i]);


        //Zadanie 5
        System.out.println(" ");
        System.out.println("TASK #5");
        System.out.println(" ");
        System.out.println("1 = 1");
        System.out.println("1/2 = 0.5");
        System.out.println("1/3 = 0.33");
        System.out.println("1/4 = 0.25");
        System.out.println("1/5 = 0.2");
        System.out.println("1/6 = 0.16");
        System.out.println("1/7 = 0.14");
        System.out.println("1/8 = 0.125");
        System.out.println("1/9 = 0.111");
        System.out.println("1/10 = 0.1");
        System.out.println(" ");
        System.out.println("TASK #6");
        System.out.println(" ");


        //Zadanie 6

        final int max = 100;
        final int rnd = rnd(max);

        System.out.println(+ rnd);
    }
    public static int rnd(int max) {
        return (int) (Math.random() * ++max);


        //Zadanie 7


    }
    }



