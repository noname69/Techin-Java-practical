package online.nonamelab;

import java.math.BigDecimal;

public final class TaxConfig {

    private TaxConfig() {} // prevent instantiation

    public static final BigDecimal TAX_21 = BigDecimal.valueOf(21);
    public static final BigDecimal TAX_9 = BigDecimal.valueOf(9);

    public static final BigDecimal ALCOHOL_EXCISE_LESS_15 = BigDecimal.valueOf(0.89);
    public static final BigDecimal ALCOHOL_EXCISE_MORE_15 = BigDecimal.valueOf(1.26);

    public static final BigDecimal WINE_EXCISE_LESS_8_5 = BigDecimal.valueOf(0.28);
    public static final BigDecimal WINE_EXCISE_MORE_8_5 = BigDecimal.valueOf(0.72);

    public static final BigDecimal THRESHOLD_15 = BigDecimal.valueOf(15);
    public static final BigDecimal THRESHOLD_8_5 = BigDecimal.valueOf(8.5);

    public static final BigDecimal CHF_RATE = BigDecimal.valueOf(0.98);
}