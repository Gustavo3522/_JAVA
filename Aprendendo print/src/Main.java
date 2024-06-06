//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x ;

        System.out.print("digite um algo: ");
        x = scanner.next().charAt(0);

        System.out.println("Vc digitou " + x);
    }
}