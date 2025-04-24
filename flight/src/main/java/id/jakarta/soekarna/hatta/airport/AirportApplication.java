package id.jakarta.soekarna.hatta.airport;

import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("airport")
public class AirportApplication extends Application {
    // Needed to enable Jakarta REST and specify path.

  //todo checklist
  //model airport to POJOs
  //Use Jax RS APIs to create generic ands specific controllers
  //model database (sql) using JPA
  //connect to kafka and add a search service
  //Add logging
  //add another service to emit and recieve flight signals
}
