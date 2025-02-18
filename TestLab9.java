import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



    class TestLab9 {


        @Test
        void testTotal() {
            Order order = new Order();
            order.addFlavor(new Flavour.Flavor("Pistachio Delight", 10));
            assertEquals(10.8, order.getTotal());
        }


    }

