package id.jakarta.soekarna.hatta.airport.controller;

import id.jakarta.soekarna.hatta.airport.model.BaggageBelt;
import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.Gate;
import id.jakarta.soekarna.hatta.airport.service.AirportComponentService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import java.util.Set;

@Path("components")
public class AirportComponentController {

  @Inject
  private AirportComponentService airportComponentService;

  @GET
  @Path("gates/{gateNumber}/flight")
  @Produces({"application/json"})
  public Flight getFlightByGateNumber(@PathParam("gateNumber") String gateNumber){
    return airportComponentService.findFlightByGateNumber(gateNumber);
  }

  @GET
  @Path("gates/{gateNumber}")
  @Produces({"application/json"})
  public Gate getGateInfo(@PathParam("gateNumber") String gateNumber) {
    return airportComponentService.findGateInfoByGateNumber(gateNumber);
  }

  @GET
  @Path("belts")
  @Produces({"application/json"})
  public Set<BaggageBelt> getAllBeltInfo() {
    return airportComponentService.getAllBeltInfo();
  }

  @GET
  @Path("belts/{beltNumber}")
  @Produces({"application/json"})
  public BaggageBelt getBeltInfo(@PathParam("beltNumber") String beltNumber) {
    return airportComponentService.getBeltByBeltNumber(beltNumber);
  }
}
