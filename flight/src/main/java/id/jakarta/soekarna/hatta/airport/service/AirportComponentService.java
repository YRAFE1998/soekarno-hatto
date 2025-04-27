package id.jakarta.soekarna.hatta.airport.service;

import id.jakarta.soekarna.hatta.airport.model.BaggageBelt;
import id.jakarta.soekarna.hatta.airport.model.CheckInCounter;
import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.Gate;

import java.util.Set;

public interface AirportComponentService {
  Gate findGateInfoByGateNumber(String gateNumber);
  void updateGateStatus(String flightNumber, String gateNumber, Gate.GateStatus status);
  Flight findFlightByGateNumber(String gateNumber);
  BaggageBelt getBeltByBeltNumber(String beltNumber);
  Set<BaggageBelt> getAllBeltInfo();

  CheckInCounter getCheckInCounterByCounterNumber(String counterNumber);
  Set<CheckInCounter> getAllCheckInCounters();
}
