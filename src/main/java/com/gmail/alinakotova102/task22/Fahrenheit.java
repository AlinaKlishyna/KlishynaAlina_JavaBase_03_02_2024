package com.gmail.alinakotova102.task22;

public class Fahrenheit extends Converter {
    @Override
    public double temperatureFromCelsius(double degreeCelsius) {
        return (degreeCelsius * 1.8) + 32;
    }

    @Override
    public double temperatureToCelsius(double degreeCelsius) {
        return (degreeCelsius - 32) * 5.0/9;
    }
}
