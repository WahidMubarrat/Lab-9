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




    }



