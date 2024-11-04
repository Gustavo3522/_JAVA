package entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public Double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
       grossSalary = percentage / 100 * grossSalary + netSalary();

    }


    public String toString(){
        return name + ", $" + netSalary() ;

    }
}

