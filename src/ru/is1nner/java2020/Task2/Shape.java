package ru.is1nner.java2020.Task2;
public class Shape {
    private int SidesCnt;
    private String ShapeName;

    public Shape(int SidesCnt, String ShapeName) {
        this.SidesCnt = SidesCnt;
        this.ShapeName = ShapeName;
    }

    public void setSidesCnt(int sidesCnt) {
        this.SidesCnt = sidesCnt;
    }

    public int getSidesCnt() {
        return SidesCnt;
    }

    @Override
    public String toString() {
        return "ShapeName = \"" + ShapeName + "\"";
    }

    void printShapeInfo() {
        System.out.println(SidesCnt);
        System.out.println(ShapeName);
    }
}