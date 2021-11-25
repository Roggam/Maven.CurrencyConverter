package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.US_DOLLAR;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.US_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
