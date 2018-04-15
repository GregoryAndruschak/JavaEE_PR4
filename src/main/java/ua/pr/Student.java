package ua.pr;

public class Student {

    public Student() {
        name = "Student";
        group = 0;
        mark = 0.0;
    }

    public Student(String n, double m, int g) {
        name = n;
        group = g;
        mark = m;
    }

    private String name;

    public void setName(String n) {
        name = n;
    }

    private double mark;

    public void setMark(double n) {
        mark = n;
    }

    private int group;

    public void setGroup(int n) {
        group = n;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "; Mark: " + mark + "; Group: " + group + ".");
    }

}
