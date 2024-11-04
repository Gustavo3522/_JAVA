package application;
import entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Entre product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data:  " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data:  " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data:  " + product);




        sc.close();
    }
}
