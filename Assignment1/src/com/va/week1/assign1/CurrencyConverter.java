package com.va.week1.assign1;

public class CurrencyConverter {
    private final double exchangeRate; // CAD to USD

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToUSD(double cad) {
        return cad * exchangeRate;
    }
}
