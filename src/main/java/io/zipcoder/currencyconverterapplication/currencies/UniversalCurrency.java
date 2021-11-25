package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    private  CurrencyType currencyType = CurrencyType.UNIVERSAL_CURRENCY;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
