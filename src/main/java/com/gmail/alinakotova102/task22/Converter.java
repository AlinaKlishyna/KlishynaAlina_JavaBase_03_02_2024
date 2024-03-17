package com.gmail.alinakotova102.task22;

public abstract class Converter {
    protected final float T0 = 273.15F;

    abstract double temperatureFromCelsius(double degreeCelsius);

    abstract double temperatureToCelsius(double degreeCelsius);
}
