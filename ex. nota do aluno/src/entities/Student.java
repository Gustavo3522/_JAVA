package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double final_grade(){
        return n1 + n2 + n3;
    }

    public double missing(){
        return 60 - final_grade();
    }
}
