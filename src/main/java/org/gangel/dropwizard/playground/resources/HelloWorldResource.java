package org.gangel.dropwizard.playground.resources;

import org.gangel.dropwizard.playground.api.HelloWorldData;
import org.gangel.dropwizard.playground.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorldData hello() {
        Person p1 = Person.create("John Walker", 123);
        return new HelloWorldData(p1.toString());
    }

}
