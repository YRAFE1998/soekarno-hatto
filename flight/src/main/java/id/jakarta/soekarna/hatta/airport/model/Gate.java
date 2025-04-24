package id.jakarta.soekarna.hatta.airport.model;

public class Gate {
  private final String gateNumber;
  private final Terminal terminal;
  private GateStatus status;
  private Flight flight;

  public Gate(String gateNumber, Terminal terminal) {
    this.gateNumber = gateNumber;
    this.terminal = terminal;
  }

  public enum GateStatus {
    OPEN,
    CLOSED,
    BOARDING,
    DELAYED
  }

  public String getGateNumber() {
    return gateNumber;
  }

  public Terminal getTerminal() {
    return terminal;
  }

  public GateStatus getStatus() {
    return status;
  }

  public void setStatus(GateStatus status) {
    this.status = status;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }
}