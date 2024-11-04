package application;

import entities.Data;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas vão ser registradas ? ");
        int n = sc.nextInt();

        Data[] vect = new Data[n];

        for(int i=0; i<vect.length; i++){
            System.out.println("Dados da " + (i+1) + " pessoa ");

            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Data(name,idade,altura);
        }

        double soma = 0.0;
        for(int i=0; i< vect.length; i++){
            soma += vect[i].getAltura();
        }

        int nmenores = 0;
        for(int i=0; i< vect.length; i++){
            if (idade < 16){
                nmenores++;
            }
        }

        double media = soma / vect.length;

        System.out.println("Altura média: " + media);
        System.out.println("Números de menores de idade: " + nmenores);




        sc.close();
    }
}

