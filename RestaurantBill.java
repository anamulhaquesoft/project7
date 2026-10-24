
import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;
        double vat = total * 0.05;
        double bill = total + vat;

        System.out.println("----- Restaurant Bill -----");
        System.out.println("Total: " + total);
        System.out.println("VAT (5%): " + vat);
        System.out.println("Final Bill: " + bill);

        sc.close();
    }
}
