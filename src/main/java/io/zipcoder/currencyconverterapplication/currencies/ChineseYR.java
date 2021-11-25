package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

private final CurrencyType currencyType = CurrencyType.CHINESE_YR;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/ CurrencyType.CHINESE_YR.getRate();
    }

    @Override
    public CurrencyType getType() {
        return this.currencyType;
    }
}
