package com.gmail.alinakotova102.task22;

public class Kelvin extends Converter {

    @Override
    public double temperatureConversion(double degreeCelsius) {
        return degreeCelsius + T0;
    }
}