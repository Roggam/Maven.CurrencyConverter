package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    private  CurrencyType currencyType = CurrencyType.YEN;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.YEN.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
