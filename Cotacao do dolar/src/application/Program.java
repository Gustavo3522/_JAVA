package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price ? ");
        CurrencyConverter.valor = sc.nextDouble();

        System.out.println("How many dollars will be bought ? ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + CurrencyConverter.tax());




        sc.close();
    }
}
