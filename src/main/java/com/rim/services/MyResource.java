package com.rim.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/rr")
public class MyResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it !";
    }
    
}
