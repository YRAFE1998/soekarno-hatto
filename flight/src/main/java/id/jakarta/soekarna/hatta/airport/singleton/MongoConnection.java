package id.jakarta.soekarna.hatta.airport.singleton;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;

@Singleton
public class MongoConnection {

  private Datastore datastore;

  @PostConstruct
  public void init(){
    MongoClient mongoClient = MongoClients.create("mongodb://admin:pass@mongo:27017");
    datastore = Morphia.createDatastore(mongoClient, "airport");

    datastore.ensureIndexes();
  }
}
