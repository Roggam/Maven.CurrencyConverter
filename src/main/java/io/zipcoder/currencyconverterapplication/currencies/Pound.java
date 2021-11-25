package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.POUND;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.POUND.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
