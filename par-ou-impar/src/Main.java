import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver se é PAR ou ÍMPAR: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.print("O número " + num + " é PAR");
        } else {
            System.out.print("O número " + num + " é ÍMPAR");
        }

        scanner.close();
    }
}
