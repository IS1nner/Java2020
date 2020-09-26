package ru.is1nner.java2020.Task6;

    public class MovableTest {
        public static void main(String[] args){
            Movable m1 = new MovableCircle(2, 1, 3 ,3,3);
            Movable m2 = new MovableRectangle(1, 2, 2, 1, 1, 2);
            m1.moveDown();
            m2.moveUp();
            System.out.println(m1);
            System.out.println(m2);
        }
    }