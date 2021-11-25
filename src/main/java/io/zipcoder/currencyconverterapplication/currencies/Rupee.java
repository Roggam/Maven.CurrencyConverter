package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.RUPEE;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.RUPEE.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
