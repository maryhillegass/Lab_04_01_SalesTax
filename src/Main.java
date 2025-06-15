//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double purchasePrice = 15.00;
        final double TAX_RATE = 0.05;
        double salesTax = purchasePrice * TAX_RATE;

        System.out.println("For a purchase price of " + purchasePrice
                + " the 5% sales tax is " + salesTax);
        }
    }