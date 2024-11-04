import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um valor: ");
    int num = sc.nextInt();

    for(int cont =1 ; cont < num; cont++){
        if ( cont % 2 != 0){
            System.out.println(cont);
        }
    }

    }
}