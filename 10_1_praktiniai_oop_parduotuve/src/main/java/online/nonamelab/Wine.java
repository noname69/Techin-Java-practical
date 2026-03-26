package online.nonamelab;

import java.math.BigDecimal;

public class Wine extends AlcoholProduct {



    public Wine(String name, BigDecimal price, BigDecimal capacity, BigDecimal alcoholPercent) {
        super(name, price, capacity, alcoholPercent);
    }

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal excise = calculateExcise(
                TaxConfig.THRESHOLD_8_5,
                TaxConfig.WINE_EXCISE_LESS_8_5,
                TaxConfig.WINE_EXCISE_MORE_8_5
        );

        BigDecimal priceWithExcise = getPrice().add(excise);
        return priceWithTax(priceWithExcise, TaxConfig.TAX_21);
    }

    @Override
    public String toString() {
        return "Vinas: \n" +
                super.toString() +
                "Kaina su mokesciais EUR: " + calculatePrice() + "\n" +
                "Kaina su mokesciais CHF: " + convertToCHF(calculatePrice()) + "\n" +
                "Talpa: " + capacity + "\n" +
                "Procentai: " + alcoholPercent + "\n";
    }
}
