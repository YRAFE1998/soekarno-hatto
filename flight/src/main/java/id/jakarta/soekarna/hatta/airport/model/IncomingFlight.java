package id.jakarta.soekarna.hatta.airport.model;

import jakarta.enterprise.inject.Model;

import java.time.LocalDateTime;


public class IncomingFlight extends Flight{
  private LocalDateTime arrivalTime;
  private String departureAirport;

  public IncomingFlight(String flightNumber, String airline, String aircraftType) {
    super(flightNumber, airline, aircraftType);
  }

  public LocalDateTime getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(LocalDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public String getDepartureAirport() {
    return departureAirport;
  }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  @Override
  public void updateTime(LocalDateTime newTime) {
    this.arrivalTime = newTime;
  }

  @Override
  public LocalDateTime getTime() {
    return getArrivalTime();
  }
}
