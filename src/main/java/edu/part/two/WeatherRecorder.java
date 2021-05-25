package edu.part.two;

import java.util.*;

public class WeatherRecorder {

  private ArrayList <WeatherObserver> observers = new ArrayList <WeatherObserver> ();
  private String latestUpdateType;
  private String latestUpdateCountry;
  private String latestUpdateText;

  public void attach(WeatherObserver o) {
  // Complete this method so that it adds the observer to the list of observers
    observers.add(o);
  }

  public void setLatestNews(String theCountry, String theUpdateType, String theUpdateText) {
    latestUpdateType=theUpdateType;
    latestUpdateCountry=theCountry;
    latestUpdateText=theUpdateText;
    this.notifyObservers();
  }

  public String getUpdateType() {
    return latestUpdateType;
  }

  public String getUpdateCountry() {
    return latestUpdateCountry;
  }

  public String getUpdateText() {
    return latestUpdateText;
  }

  private void notifyObservers() {
// Complete this method to go through each observer in turn,
// sending it a message to notify that an update has occurred
    for(WeatherObserver o : observers) {
      o.update();
    }
  }
}
