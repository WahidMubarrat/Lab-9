import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



    class TestLab9 {


        @Test
        void testTotalforFlavor() {
            Order order = new Order();
            order.addFlavor(new Flavour.Flavor("Pistachio Delight", 10));
            assertEquals(10.8, order.getTotal());
        }
        @Test
        void testGlassJarCost() {
            Order order = new Order();
            order.setGlassJar(true);
            assertEquals(5.40, order.getTotal());
        }
        @Test
        void testTotalforTopping() {
           Order order = new Order();
            order.addTopping(new Topping("Sprinkles", 0.30));
            assertEquals(0.32, order.getTotal(),01);
        }
        @Test
        void testTotalWithFlavorsAndToppings() {
            Order order = new Order();
            order.addFlavor(new Flavour.Flavor("2. Chocolate Fudge ", 3.00));

            order.addTopping(new Topping("Fresh Strawberries", 1.00));

            assertEquals(4.32, order.getTotal());
        }
        @Test
        void testTotalwithGlassJar() {
            Order order = new Order();
            order.addFlavor(new Flavour.Flavor("Chocolate Fudge", 3.00));
            order.addTopping(new Topping("Fresh Strawberries ", 1.00));
            order.setGlassJar(true);
            assertEquals(9.72, order.getTotal());
        }
       

    }

