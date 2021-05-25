package edu.part.two;

public class TestWeather {
  public static void main(String[] args) {
    WeatherRecorder wr = new WeatherRecorder();
    WeatherObserver englandWatcher = new WarningWatcher(wr, "England");
    WeatherObserver walesWatcher   = new WarningWatcher(wr, "Wales");

    wr.setLatestNews("England", "Current Temperature", "15");
    wr.setLatestNews("Wales", "Warning", "Very Windy");
    wr.setLatestNews("Wales", "Current Rainfall", "0");
    wr.setLatestNews("England", "Warning", "Very Snowy");
  }
}
