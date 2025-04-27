package id.jakarta.soekarna.hatta.airport.model;

import jakarta.enterprise.inject.Model;

import java.time.LocalDateTime;


public class OutgoingFlight extends Flight{
  private LocalDateTime departureTime;

  public OutgoingFlight(String flightNumber, String airline, String aircraftType) {
    super(flightNumber, airline, aircraftType);
  }

  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }

  @Override
  public void updateTime(LocalDateTime newTime) {
    this.departureTime = newTime;
  }

  @Override
  public LocalDateTime getTime() {
    return getDepartureTime();
  }
}
