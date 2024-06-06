import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de funcionarios: ");
    int funcionario = scanner.nextInt();

    System.out.print("Digite quantas horas foram trabalhadas: ");
    int horas = scanner.nextInt();

    System.out.print("Digite o valor por horas trabalhadas: ");
    float salario = scanner.nextFloat();

    float salario2  = salario * horas  ;

    System.out.println("Número de funcionarios: " + funcionario);
    System.out.println("Salario R$" + salario2);

    scanner.close();
    }
}