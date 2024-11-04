import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char resposta;
    do{
        System.out.print("Digite a temperatura em Celsius: ");
        Double c = sc.nextDouble();
        Double f = 9.0 * c  / 5.0 + 32.0 ;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
        System.out.print("Deseja repetir (S/N)? ");
        resposta = sc.next().charAt(0);
    } while (resposta != 'n');

     System.out.print("Fim do programa.");

        sc.close();
    }
}