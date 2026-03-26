package online.nonamelab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Product {
    private final String name;
    private final BigDecimal price;


    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public static BigDecimal priceWithTax(BigDecimal price, BigDecimal tax) {
        return price.add(price.multiply(tax).divide(BigDecimal.valueOf(100)));
    }

    public abstract BigDecimal calculatePrice();

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static BigDecimal convertToCHF(BigDecimal price) {
        return price.multiply(TaxConfig.CHF_RATE).setScale(2, RoundingMode.HALF_UP);
    }


    @Override
    public String toString() {
        return  "Pavadinimas: " + name + '\n' +
                "Kaina be mokesciu EUR: " + price + "\n";
    }
}
