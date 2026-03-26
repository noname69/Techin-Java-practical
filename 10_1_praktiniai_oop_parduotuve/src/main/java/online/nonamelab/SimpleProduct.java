package online.nonamelab;

import java.math.BigDecimal;

public class SimpleProduct extends Product{

    public SimpleProduct(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public BigDecimal calculatePrice() {
        return priceWithTax(getPrice(), TaxConfig.TAX_21);
    }

    @Override
    public String toString() {
        return "Paprasta preke: \n" +
                super.toString() +
                "Kaina su mokesciais EUR: " + calculatePrice() + "\n" +
                "Kaina su mokesciais CHF: " + convertToCHF(calculatePrice()) + "\n";
    }
}
