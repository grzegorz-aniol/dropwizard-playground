package org.gangel.dropwizard.playground.resources;

import org.gangel.dropwizard.playground.api.HelloWorldData;
import org.gangel.dropwizard.playground.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorldResource {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorldData hello() {
        Person p1 = Person.create("John Walker", 123);
        return new HelloWorldData(p1.toString());
    }

}
