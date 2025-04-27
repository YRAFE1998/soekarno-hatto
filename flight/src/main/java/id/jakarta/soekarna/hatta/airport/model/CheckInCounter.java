package id.jakarta.soekarna.hatta.airport.model;

import jakarta.enterprise.inject.Model;

public class CheckInCounter {
  private String counterNumber;
  private Flight flight;
  private Terminal terminalCode;

  public String getCounterNumber() {
    return counterNumber;
  }

  public void setCounterNumber(String counterNumber) {
    this.counterNumber = counterNumber;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public Terminal getTerminalCode() {
    return terminalCode;
  }

  public void setTerminalCode(Terminal terminalCode) {
    this.terminalCode = terminalCode;
  }
}
