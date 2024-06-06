/*em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        float num = sc.nextFloat();

        if(num > 0 && num <= 25 ){
            System.out.print("O número " + num + " esta entre 0 e 25");
        } else if (num > 25  && num <=50 ) {
            System.out.print("O número " + num + " esta entre 25 e 50");
        } else if (num > 50  && num <=75 ) {
            System.out.print("O número " + num + " esta entre 50 e 75");
        } else if (num > 75  && num <=100 ) {
            System.out.print("O número " + num + " esta entre 75 e 100");
        } else {
            System.out.print("Esse valor esta fora dos intervalos");
        }

        sc.close();
    }
}