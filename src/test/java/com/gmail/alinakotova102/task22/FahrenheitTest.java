package com.gmail.alinakotova102.task22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FahrenheitTest {
    final double PRECISION = 0.0001;
    Fahrenheit fahrenheit;

    @BeforeEach
    void setUp() {
        fahrenheit = new Fahrenheit();
    }

    @Test
    void temperatureFromCelsius() {
        double actual = fahrenheit.temperatureFromCelsius(10);

        double expected = 50;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureFromCelsiusNegative() {
        double actual = fahrenheit.temperatureFromCelsius(-5);

        double expected = 23;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureFromCelsiusZero() {
        double actual = fahrenheit.temperatureFromCelsius(0);

        double expected = 32;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureFromCelsiusFloat() {
        double actual = fahrenheit.temperatureFromCelsius(5.5);

        double expected = 41.9;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsius(){
        double actual = fahrenheit.temperatureToCelsius(1);

        double expected = -17.2222;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsiusNegative(){
        double actual = fahrenheit.temperatureToCelsius(-5);

        double expected = -20.5556;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsiusZero(){
        double actual = fahrenheit.temperatureToCelsius(0);

        double expected = -17.77778;

        assertEquals(expected, actual, PRECISION);
    }
}
