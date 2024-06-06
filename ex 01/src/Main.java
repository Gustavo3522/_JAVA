import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scanner. nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scanner. nextInt();

        int total = n1 + n2 ;

        System.out.println("A soma de " + n1 + " e de " + n2 + " é de " + total);

        scanner.close();
    }
}