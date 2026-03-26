package online.nonamelab;

import java.math.BigDecimal;

public class Alcohol extends AlcoholProduct {

    public Alcohol(String name, BigDecimal price, BigDecimal capacity, BigDecimal alcoholPercent) {
        super(name, price, capacity, alcoholPercent);
    }

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal excise = calculateExcise(
                TaxConfig.THRESHOLD_15,
                TaxConfig.ALCOHOL_EXCISE_LESS_15,
                TaxConfig.ALCOHOL_EXCISE_MORE_15
        );

        BigDecimal priceWithExcise = getPrice().add(excise);
        return priceWithTax(priceWithExcise, TaxConfig.TAX_21);
    }

    @Override
    public String toString() {
        return "Alkoholis : \n" +
                super.toString() +
                "Kaina su mokesciais EUR: " + calculatePrice() + "\n" +
                "Kaina su mokesciais CHF: " + convertToCHF(calculatePrice()) + "\n" +
                "Talpa: " + capacity + "\n" +
                "Procentai: " + alcoholPercent + "\n";
    }
}
