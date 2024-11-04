package application;

import entities.Employee;

import java.util.Scanner;

public class Project {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee.name + " " + employee.grossSalary);




        sc.close();
    }
}
