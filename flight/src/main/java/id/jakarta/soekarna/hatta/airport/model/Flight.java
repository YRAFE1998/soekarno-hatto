package id.jakarta.soekarna.hatta.airport.model;

import jakarta.enterprise.inject.Model;

import java.time.LocalDateTime;


public abstract class Flight {
  private final String flightNumber;
  private final String airline;
  private final String aircraftType;
  private FlightStatus status;
  private Gate gate;

  public Flight(String flightNumber, String airline, String aircraftType) {
    this.flightNumber = flightNumber;
    this.airline = airline;
    this.aircraftType = aircraftType;
  }

  public abstract void updateTime(LocalDateTime newTime);
  public abstract LocalDateTime getTime();

  public String getFlightNumber() {
    return flightNumber;
  }

  public String getAirline() {
    return airline;
  }

  public String getAircraftType() {
    return aircraftType;
  }

  public Gate getGate() {
    return gate;
  }

  public void setGate(Gate gate) {
    this.gate = gate;
  }

  public FlightStatus getStatus() {
    return status;
  }

  public void setStatus(FlightStatus status) {
    this.status = status;
  }

  public enum FlightStatus{
    ON_TIME,
    EARLY,
    DELAYED,
    CANCELLED
  }


}
