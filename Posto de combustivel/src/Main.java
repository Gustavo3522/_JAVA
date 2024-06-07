import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alcool = 0;
    int gasolina = 0;
    int disel = 0;

    System.out.print(""" 
            [1] Álcool
            [2] Gasolina
            [3] Disel
            [4] Fim
            FAÇA UMA ESCOLHA: """);
    int escolha = sc.nextInt();

    while (escolha != 4){
        if (escolha == 1){
            alcool +=1;
        } else if (escolha == 2) {
            gasolina +=1;
        } else if (escolha == 3) {
            disel +=1;
        }
        System.out.print(""" 
            [1] Álcool
            [2] Gasolina
            [3] Disel
            [4] Fim
            FAÇA UMA ESCOLHA: """);
            escolha = sc.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Álcool " + alcool);
    System.out.println("Gasolina " + gasolina);
    System.out.println("Disel " + disel);


  sc.close();
    }
}