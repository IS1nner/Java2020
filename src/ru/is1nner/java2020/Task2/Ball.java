package ru.is1nner.java2020.Task2;
import java.lang.String;
public class Ball {
    public String Color;
    public int Weight;
    public String toString() {
        return this.Color + ", BALL WEIGHT = " + this.Weight;
    }
    public Ball(String c, int w){
        Color = c;
        Weight = w;
        if (w > 567 & w < 650)
            System.out.println(this.Color + " BALL: THIS IS BASKETBALL BALL");
        else {
            if (w > 260 & w < 280)
                System.out.println(this.Color + " BALL: THIS IS VOLLEYBALL BALL");
            if (w>410 & w<450)
                System.out.println(this.Color + " BALL: THIS IS FOOTBALL BALL");
            else {
                System.out.println(this.Color + " BALL: THIS BALL IS NOT FOOTBALL BALL, VOLLEYBALL BALL, NEITHER BASKETBALL BALL");
            }
        }
    }
    public Ball(String c){
        Color = c;
        System.out.println("BALL COLOR = " + this.Color);
    }
}