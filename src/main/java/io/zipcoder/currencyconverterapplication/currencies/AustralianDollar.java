package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.AUSTRALIAN_DOLLAR;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.AUSTRALIAN_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
