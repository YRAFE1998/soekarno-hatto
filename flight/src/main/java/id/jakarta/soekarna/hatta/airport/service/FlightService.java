package id.jakarta.soekarna.hatta.airport.service;

import id.jakarta.soekarna.hatta.airport.model.Flight;

public interface FlightService {
  Flight findFlightInfoByFlightNumber(String flightNumber);
  void changeFlightStatus(String flightNumber, Flight.FlightStatus status);
  void updateFlightGate(String flightNumber, String gateNumber);
  void updateFlightDepartureTime(String flightNumber, String departureTime);
  void updateFlightTime(String flightNumber, String arrivalTime);
}
