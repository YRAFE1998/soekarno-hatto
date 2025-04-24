package id.jakarta.soekarna.hatta.airport.model;

import java.time.LocalDateTime;

public class OutgoingFlight {
  private LocalDateTime departureTime;

  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }
}
