import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order{

        private static final double tax_rate = 0.08;
        private static final double glass_jar_cost = 5.00;
        private final List<Flavour.Flavor> flavors = new ArrayList<>();
        private final List<Topping> toppings = new ArrayList<>();
        private double subtotal = 0.0;
        private boolean glassJar;

        public void addFlavor(Flavour.Flavor flavor) {
            flavors.add(flavor);
            subtotal += flavor.getPrice();
        }

        public void addTopping(Topping topping) {
            toppings.add(topping);
            subtotal += topping.getPrice();
        }

        public void setGlassJar(boolean glassJar) {
            this.glassJar = glassJar;
            if (glassJar) {
                subtotal += glass_jar_cost;
            }
        }

        public double getTotal() {
            return subtotal + (subtotal * tax_rate);
        }


  public void generateInvoice(String format) throws IOException {
  System.out.println("Yogurt Shop Invoice\n");
        String invoiceContent = "Yogurt Shop Invoice\n";
        for (Flavour.Flavor flavor : flavors) {
            invoiceContent += flavor.getName() + " - $" + flavor.getPrice() + "\n";
        }
        for (Topping topping : toppings) {
            invoiceContent += topping.getName() + " - $" + topping.getPrice() + "\n";
        }
        invoiceContent += "Subtotal: $" + String.format("%.2f", subtotal) + "\n";
        invoiceContent += "Tax: $" + String.format("%.2f", subtotal * tax_rate) + "\n";
        invoiceContent += "Total Amount Due: $" + String.format("%.2f", getTotal()) + "\n";

        if ("csv".equalsIgnoreCase(format)) {
            try (FileWriter writer = new FileWriter("invoice.csv")) {
                writer.write("Ingredients,Amount,Price\n");
                for (Flavour.Flavor flavor : flavors) {
                    writer.write(flavor.getName() + ",1," + flavor.getPrice() + "\n");
                }
                for (Topping topping : toppings) {
                    writer.write(topping.getName() + ",1," + topping.getPrice() + "\n");
                }
                writer.write("Subtotal,-," + String.format("%.2f", subtotal) + "\n");
                writer.write("Tax,-," + String.format("%.2f", subtotal * tax_rate) + "\n");
                writer.write("Total Amount Due,-," + String.format("%.2f", getTotal()) + "\n");
            }
        } else {
            try (FileWriter writer = new FileWriter("invoice.txt")) {
                writer.write(invoiceContent);
            }
        }}
    }



