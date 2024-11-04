package application;

import entities.Data;

import java.util.Scanner;

public class Program {

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter accont number: ");
        int password = sc.nextInt();

        System.out.print("Enter accont holder: ");
        String name = sc.next();

        Data data = new Data(password, name);

        if(password == 3522 || name == "Gustavo") {
            System.out.print("access allowed");

            System.out.print("Is there na initial depoist (y/n)? ");
            char option =sc.next().charAt(0);

            if(option == 'y') {
                System.out.print("Enter initial value: ");
                data.initial_deposit = sc.nextDouble();


                System.out.println("Do you want the withdrawal amount to be shown?  (y/n) ");
                 char response = sc.next().charAt(0);

                if (response == 'y'){
                    System.out.println("Account " + data.getPassword() + ", Holder: " + data.getName() + ", Balance: $" + data.initial_deposit);
                }else{
                    System.out.println("Account " + data.getPassword() + ", Holder: " + data.getName() + ", Balance: $  ******");
                }
            }

            System.out.print("Enter a deposit value: ");
            data.new_deposit = sc.nextDouble();

            System.out.println("Account " + data.getPassword() + ", Holder: " + data.getName() + ", Balance: $" + data.total_deposit());

            System.out.print("Enter a withdraw value: ");
            data.withdraw = sc.nextDouble();

            System.out.println("Account " + data.getPassword() + ", Holder: " + data.getName() + ", Balance: $" + data.remaining_balance());

            System.out.print("Thank you for choosing our bank, check back often !!!");
        }else{
            System.out.println("access denied, incorrect password or name incorrect !!");
        }



    }
}
