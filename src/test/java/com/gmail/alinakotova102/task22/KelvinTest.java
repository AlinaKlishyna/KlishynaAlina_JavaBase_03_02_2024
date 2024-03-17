package com.gmail.alinakotova102.task22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KelvinTest {
    final double PRECISION = 0.0001;
    Kelvin kelvin;

    @BeforeEach
    void setUp() {
        kelvin = new Kelvin();
    }

    @Test
    void temperatureFromCelsius() {
        double actual = kelvin.temperatureFromCelsius(10);

        double expected = 283.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureFromCelsiusNegative() {
        double actual = kelvin.temperatureFromCelsius(-10);

        double expected = 263.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureFromCelsiusZero() {
        double actual = kelvin.temperatureFromCelsius(0);

        double expected = 273.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsius() {
        double actual = kelvin.temperatureToCelsius(10);

        double expected = -263.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsiusNegative() {
        double actual = kelvin.temperatureToCelsius(-5);

        double expected = -278.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureToCelsiusZero() {
        double actual = kelvin.temperatureToCelsius(0);

        double expected = -273.15;

        assertEquals(expected, actual, PRECISION);
    }
}