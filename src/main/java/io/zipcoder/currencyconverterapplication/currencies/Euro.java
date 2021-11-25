package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType currencyType = CurrencyType.EURO;
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.EURO.getRate();
    }

    @Override
    public CurrencyType getType() {
        return currencyType;
    }
}
