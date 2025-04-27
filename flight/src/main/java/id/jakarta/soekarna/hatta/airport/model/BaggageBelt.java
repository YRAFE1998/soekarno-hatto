package id.jakarta.soekarna.hatta.airport.model;

import jakarta.enterprise.inject.Model;

import java.util.List;


public class BaggageBelt {
  private String beltNumber;
  private List<Flight> flights;
  private Terminal terminal;

  public String getBeltNumber() {
    return beltNumber;
  }

  public void setBeltNumber(String beltNumber) {
    this.beltNumber = beltNumber;
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public void setFlights(List<Flight> flights) {
    this.flights = flights;
  }

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }
}
