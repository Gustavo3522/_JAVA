package entities;

public class CurrencyConverter {
    public static double valor;
    public static double dolar;

    public static double AmountToBePaid() {
        return valor * dolar;
    }

    public static double tax() {
         return 6.0 / 100.0 * AmountToBePaid() + AmountToBePaid();
    }
}



