//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Select yogurt flavor(s):");
        System.out.println("1. Cookies and Cream - $2.80");
        System.out.println("2. Chocolate Fudge - $3.00");
        System.out.println("3. Pistachio Delight - $3.25");
        System.out.print("Enter your choice : ");
        String[] flavors = scanner.nextLine().split(",");

        for (String choice : flavors) {
            switch (choice.trim()) {
                case "1": order.addFlavor(new Flavour.Flavor("Cookies and Cream", 2.80)); break;
                case "2": order.addFlavor(new Flavour.Flavor("Chocolate Fudge", 3.00)); break;
                case "3": order.addFlavor(new Flavour.Flavor("Pistachio Delight", 3.25)); break;
            }
        }

        System.out.println("Select toppings:");
        System.out.println("1. Sprinkles - $0.30");
        System.out.println("2. Mixed chopped nuts - $0.80");
        System.out.println("3. Crushed Gingerbread - $0.75");
        System.out.println("4. Fresh Strawberries - $1.00");
        System.out.print("Enter your choice : ");
        String[] toppings = scanner.nextLine().split(",");

        for (String choice : toppings) {
            switch (choice.trim()) {
                case "1": order.addTopping(new Topping("Sprinkles", 0.30)); break;
                case "2": order.addTopping(new Topping("Mixed chopped nuts", 0.80)); break;
                case "3": order.addTopping(new Topping("Crushed Gingerbread", 0.75)); break;
                case "4": order.addTopping(new Topping("Fresh Strawberries", 1.00)); break;
            }
        }

        System.out.print("Would you like a glass jar? (yes/no): ");
        order.setGlassJar(scanner.nextLine().equalsIgnoreCase("yes"));
       double total=order.getTotal();
        System.out.println("Your total price is "+total);
   System.out.print("Choose invoice format (text/csv): ");
        String format = scanner.nextLine();
        order.generateInvoice(format);

        System.out.println("Invoice generated successfully!");
        scanner.close();
    }
}
