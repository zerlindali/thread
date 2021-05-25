package edu.part.two;

public class CelsiusToFahrenheitLoggerAdapter extends CelsiusLogger {
    FahrenheitLogger fahrenheitLogger = new FahrenheitLogger();

    @Override
    public void setTemperature(double aCelsiusTemp) {
        fahrenheitLogger.setTheTemperature(aCelsiusTemp * 9/5 + 32);
    }

    @Override
    public double getTemperature() {
        double fahreneitTemperature = fahrenheitLogger.getTheTemperature();
        return ((fahreneitTemperature - 32) * 5/9);
    }
}
