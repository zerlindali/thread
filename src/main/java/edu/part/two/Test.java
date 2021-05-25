package edu.part.two;

public class Test {
  public static void main(String[] theArguments) {
    CelsiusLogger l=new CelsiusToFahrenheitLoggerAdapter();
    l.setTemperature(22.0);
    System.out.println("Current logged temperature: " + l.getTemperature() + " Celsius.");
  }
}
