import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float valor2 = scanner.nextFloat();

        float total = (valor1 + valor2) / 2;

        if(total >= 7.0){
            System.out.println("Sua media foi " + total + ", Parabens você foi APROVADO");
            System.out.println(total);
        } else if (total > 6.0) {
            System.out.println("Sua media foi " + total + ", você está de RECUPERAÇÃO");
        } else {
            System.out.println("Sua media foi " + total + ", você está REPROVADO");
        }
    }
}