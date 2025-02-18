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

class Topping {
    private final String name;
    private final double price;
    public Topping(String name, double price) {
    this.name = name;
    this.price = price;
}

public String getName() {
    return name;
}

public double getPrice() {
    return price;
}
}