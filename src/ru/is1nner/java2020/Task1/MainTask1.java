package ru.is1nner.java2020.Task1;
public class MainTask1 {
    static int[] Numbers = new int[] {1,2,3,4,5,6,7,8,9};
    static int[] RandomMassa = new int[16];
    static int Summa, A;
    static long TempFacktorial = 1;
    static double GarmonichSumma;


    public static void main(String[] args) {

        //Task 1
        for (int number : Numbers)
        {
            Summa += number;

        }

        System.out.println(Summa);
        Summa = 0;

        while (A < Numbers.length)
        {
            Summa += Numbers[A];
            A++;

        }

        System.out.println(Summa);
        Summa = 0;
        A = 0;

        do {

            Summa += Numbers[A];
            A++;

        }

        while (A < Numbers.length);
        System.out.println(Summa);

        //Task 2

        for (String str : args) {
            System.out.print(str);

        }

        System.out.println();

        //Task 3

        for (int s = 1; s <= 10; s++) {
            GarmonichSumma += 1. / s;
            System.out.println(GarmonichSumma);

        }

        //Task 4

        for(int Z = 0; Z < RandomMassa.length; Z++)
        {

            RandomMassa[Z] = (int)Math.round((Math.random() * RandomMassa.length));

        }

        for (int Num: RandomMassa)

        {
            System.out.println(Num);

        }

        BubbleSort(RandomMassa);

        for (int Num: RandomMassa) {
            System.out.println(Num);

        }

        //Task 5

        for(long H = 1; H <= 16; H++)

        {

            TempFacktorial = TempFacktorial * H;

        }

        System.out.println(TempFacktorial);

    }

    public static void BubbleSort(int[] Array) {
        boolean Sorted = false;
        int Temp;
        while(!Sorted) {
            Sorted = true;
            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i+1]) {
                    Temp = Array[i];
                    Array[i] = Array[i+1];
                    Array[i+1] = Temp;
                    Sorted = false;
                }

            }

        }

    }

}