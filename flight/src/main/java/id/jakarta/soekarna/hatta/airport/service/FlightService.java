package id.jakarta.soekarna.hatta.airport.service;

import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.IncomingFlight;
import id.jakarta.soekarna.hatta.airport.model.OutgoingFlight;

import java.util.Set;

public interface FlightService {
  Flight findFlightInfoByFlightNumber(String flightNumber);
  Set<IncomingFlight> findAllIncomingFlights();
  Set<OutgoingFlight> findAllOutgoingFlights();
  Set<Flight> findAllActiveFlights();
  void changeFlightStatus(String flightNumber, Flight.FlightStatus status);
  void updateFlightGate(String flightNumber, String gateNumber);
  void updateFlightDepartureTime(String flightNumber, String departureTime);
  void updateFlightTime(String flightNumber, String arrivalTime);
}
