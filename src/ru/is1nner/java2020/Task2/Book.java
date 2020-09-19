package ru.is1nner.java2020.Task2;
public class Book {
    public String Name;
    public double Price;
    public double Disc;
    public double DiscMoney;
    public double PriceMinDisc;
    public Book (String n, int p, double d){
        Name = n;
        Price = p;
        Disc = d;
        DiscMoney =this.Price /100*this.Disc;
        PriceMinDisc =this.Price -this.DiscMoney;
    }
    public String toString(){
        return this.Name +"; Price = "+this.Price +"; Disc = %"+this.Disc;
    }
    public void intoDiscount(){
        System.out.println(Name +"; Disc = $"+ DiscMoney +"; Price - Disc = "+ PriceMinDisc);
    }

}