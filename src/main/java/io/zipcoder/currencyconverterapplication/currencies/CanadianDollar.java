package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.CANADIAN_DOLLAR;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
