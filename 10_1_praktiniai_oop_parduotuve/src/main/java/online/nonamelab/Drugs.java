package online.nonamelab;

import java.math.BigDecimal;

public class Drugs extends Product {

    public Drugs(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public BigDecimal calculatePrice() {
        return priceWithTax(getPrice(), TaxConfig.TAX_9);
    }

    @Override
    public String toString() {
        return "Vaistai: \n" +
                super.toString() +
                "Kaina su mokesciais EUR: " + calculatePrice() + "\n" +
                "Kaina su mokesciais CHF: " + convertToCHF(calculatePrice()) + "\n";
    }
}
