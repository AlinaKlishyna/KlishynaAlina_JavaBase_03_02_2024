package com.gmail.alinakotova102.task22;

public class Kelvin extends Converter {

    @Override
    public double temperatureFromCelsius(double degreeCelsius) {
        return degreeCelsius + T0;
    }

    @Override
    public double temperatureToCelsius(double degreeCelsius) {
        return degreeCelsius - T0;
    }
}
