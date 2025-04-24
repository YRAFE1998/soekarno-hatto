package id.jakarta.soekarna.hatta.airport.service;

import id.jakarta.soekarna.hatta.airport.model.Gate;

public interface GateService {
    Gate findGateInfoByGateNumber(String gateNumber);
    void updateGateStatus(String flightNumber, String gateNumber, Gate.GateStatus status);
}
