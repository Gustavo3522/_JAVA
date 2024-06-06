import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
     public static  void main(String[] args ){

          /* CONDICIONAIS*/

          Locale.setDefault(Locale.US);
          Scanner scanner = new Scanner(System.in);
          System.out.print("digite o salario:");
          double salario = scanner.nextDouble();

          if(salario >= 500.40){
               System.out.println("Seu salario é maior que 500.40");
          } else if (salario == 500.30) {
               System.out.println("Seu salario esta igual a 500.30");
          } else{
               System.out.println("Seu salario e menor que 500.30");
          }

          scanner.close();


                    /*VETORES (ARRAY)*/
          /* DESSA FORMA EU JA DECLAREI OS VALORES, MAS POSSO ALTERAR*/
     int[] idades = {1,2,3};
     idades[0] = 5;

          /* DESSA FORMA EU FALO QUANTOS NÚMEROS TEM DENTRO DO ARRAY MAS NAO DECLAREI VALORES*/
     int[] idade = new int[10];

                    /*ARRAY LIST*/
          ArrayList<Integer> valor = new ArrayList<Integer>();
          valor.add(30);
          valor.add(18);
          valor.add(15);
          valor.add(17);
          valor.remove(0);
          valor.get(2);
          valor.size();

                    /*LOOPS*/
          /*FOR*/
          int  idade = 10;
          for(var i = 0; i < idade; i++){
               System.out.println(i);
          }
          /*WHILE*/
          int idade_02 = 10;
          int i = 0;
          while(i < idade_02){
               i++;
               System.out.println(i);
          }

               /*CASTING*/
          /*IMPLICITO*/
          int idade1 = 22;
          double idade2 = idade1;

          /*EXPLICITO*/
          idade1 = (int) idade2;

          char letra = 'a';
          String nome = String.valueOf(letra);




     }
     }






