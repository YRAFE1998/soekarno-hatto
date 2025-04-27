package id.jakarta.soekarna.hatta.airport.controller;

import id.jakarta.soekarna.hatta.airport.model.Flight;
import id.jakarta.soekarna.hatta.airport.model.IncomingFlight;
import id.jakarta.soekarna.hatta.airport.model.OutgoingFlight;
import id.jakarta.soekarna.hatta.airport.service.FlightService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import java.util.Set;

@Path("flights")
public class FlightController {

  @Inject
  private FlightService flightService;

  @GET
  @Produces({"application/json"})
  public Set<Flight> getAllFlightDetails() {
    return flightService.findAllActiveFlights();
  }

  @GET
  @Produces({"application/json"})
  @Path("/incoming")
  public Set<IncomingFlight> getIncomingFlights() {
    return flightService.findAllIncomingFlights();
  }

  @GET
  @Path("/outcoming")
  @Produces({"application/json"})
  public Set<OutgoingFlight> getOutgoingFlights() {
    return flightService.findAllOutgoingFlights();
  }

  @GET
  @Produces({"application/json"})
  @Path("{flightNumber}")
  public Flight getFlightDetails(@PathParam("flightNumber") String flightNumber) {
    return flightService.findFlightInfoByFlightNumber(flightNumber);
  }


}
