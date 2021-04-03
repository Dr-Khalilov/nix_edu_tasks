package nix.edu;

public class ConverterTemperature {
    //6. Создайте программу, которая переводит температуру из Фаренгейта в температуру по Цельсию
    static double getDegCelsiusFromFahrenheit(double degree) {
        return (degree - 32) / 1.8;
    }

    static double getDegFahrenheitFromCelsius(double degree) {
        return degree * 1.8 + 32;
    }
}
