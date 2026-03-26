package online.nonamelab;

import java.math.BigDecimal;

abstract class AlcoholProduct extends Product {
    protected final BigDecimal capacity;
    protected final BigDecimal alcoholPercent;

    public AlcoholProduct(String name, BigDecimal price, BigDecimal capacity, BigDecimal alcoholPercent) {
        super(name, price);
        this.capacity = capacity;
        this.alcoholPercent = alcoholPercent;
    }

    protected BigDecimal calculateExcise(
            BigDecimal threshold,
            BigDecimal lowerRate,
            BigDecimal higherRate
    ) {
        if (alcoholPercent.compareTo(threshold) < 0) {
            return lowerRate.multiply(capacity);
        } else {
            return higherRate.multiply(capacity);
        }
    }
}
