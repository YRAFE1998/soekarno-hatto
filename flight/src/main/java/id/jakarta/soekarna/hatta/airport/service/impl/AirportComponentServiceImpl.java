package id.jakarta.soekarna.hatta.airport.service.impl;

import id.jakarta.soekarna.hatta.airport.model.BaggageBelt;
import id.jakarta.soekarna.hatta.airport.model.CheckInCounter;
import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.Gate;
import id.jakarta.soekarna.hatta.airport.service.AirportComponentService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

import java.util.Set;

@ApplicationScoped
public class AirportComponentServiceImpl implements AirportComponentService {
  @Override
  public Gate findGateInfoByGateNumber(String gateNumber) {
    return null;
  }

  @Override
  public void updateGateStatus(String flightNumber, String gateNumber, Gate.GateStatus status) {

  }

  @Override
  public Flight findFlightByGateNumber(String gateNumber) {
    return null;
  }

  @Override
  public BaggageBelt getBeltByBeltNumber(String beltNumber) {
    return null;
  }

  @Override
  public Set<BaggageBelt> getAllBeltInfo() {
    return Set.of();
  }

  @Override
  public CheckInCounter getCheckInCounterByCounterNumber(String counterNumber) {
    return null;
  }

  @Override
  public Set<CheckInCounter> getAllCheckInCounters() {
    return Set.of();
  }
}
