package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.SINGAPORE_DOLLAR;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.SINGAPORE_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
