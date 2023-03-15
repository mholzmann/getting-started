package at.htl.gettingstarted.api;

import at.htl.gettingstarted.dto.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public Person getPerson() {
        return new Person("John", "Smith");
    }
}

