package de.shingiro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class BlogResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Willkommen zu DevOps";
    }
}