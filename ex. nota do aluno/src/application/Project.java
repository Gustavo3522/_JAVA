package application;

import entities.Student;

import java.util.Scanner;

public class Project {
    public static void main(String[]args){
        /*Nota maxima é 100*/

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("name: ");
        student.name = sc.nextLine();

        System.out.println("First note: ");
        student.n1 = sc.nextDouble();

        System.out.println("Second note: ");
        student.n2 = sc.nextDouble();

        System.out.println("Third note: ");
        student.n3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.final_grade());

        if (student.final_grade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missing() + " POINTS");

        }


    }
}
