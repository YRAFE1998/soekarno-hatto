package id.jakarta.soekarna.hatta.airport.controller;

import id.jakarta.soekarna.hatta.airport.service.FlightService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("flight")
public class FlightController {

  @Inject
  private FlightService flightService;

  @GET
  @Produces({"application/json"})
  public String getFlight() {
    return "{ \"flight\": \"Flight data\" }";
  }

}
