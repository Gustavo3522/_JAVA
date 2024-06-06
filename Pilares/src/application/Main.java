package application;

import model.entities.Avô;

public class Main {
    public static void main(String[] args) {
        Avô avo = new Avô("Filipe", "Homem", "Avô", "03/01/2006", 50, 12, 18);

        System.out.println(avo);

        avo.fazerAniversario();

        System.out.println(avo);
    }
}