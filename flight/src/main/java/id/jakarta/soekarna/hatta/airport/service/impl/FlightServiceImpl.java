package id.jakarta.soekarna.hatta.airport.service.impl;

import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.Gate;
import id.jakarta.soekarna.hatta.airport.model.IncomingFlight;
import id.jakarta.soekarna.hatta.airport.model.OutgoingFlight;
import id.jakarta.soekarna.hatta.airport.model.Terminal;
import id.jakarta.soekarna.hatta.airport.service.FlightService;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;
import java.util.Set;

@ApplicationScoped
public class FlightServiceImpl implements FlightService {
  @Override
  public Flight findFlightInfoByFlightNumber(String flightNumber) {
    Flight flight = new IncomingFlight("GA123", "Garuda Indonesia", "Boeing 737");
    flight.setStatus(Flight.FlightStatus.ON_TIME);
    flight.setGate(new Gate("1", new Terminal()));
    flight.updateTime(LocalDateTime.now().plusHours(3));
    return flight;
  }

  @Override
  public Set<IncomingFlight> findAllIncomingFlights() {
    return Set.of();
  }

  @Override
  public Set<OutgoingFlight> findAllOutgoingFlights() {
    return Set.of();
  }

  @Override
  public Set<Flight> findAllActiveFlights() {
    return Set.of();
  }

  @Override
  public void changeFlightStatus(String flightNumber, Flight.FlightStatus status) {

  }

  @Override
  public void updateFlightGate(String flightNumber, String gateNumber) {

  }

  @Override
  public void updateFlightDepartureTime(String flightNumber, String departureTime) {

  }

  @Override
  public void updateFlightTime(String flightNumber, String arrivalTime) {

  }
}
