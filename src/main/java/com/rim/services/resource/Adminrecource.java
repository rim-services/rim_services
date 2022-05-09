package com.rim.services.resource;

import java.util.List;

import com.rim.services.dao.Admindao;
import com.rim.services.models.Admin;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/admin")
public class Adminrecource {
	private static final long serialVersionUID = 1L;

    public Adminrecource() {
        super();
    }
    Admindao ad = new Admindao();
    
    @GET
    public List<Admin> getall() {
    	
        return ad.getAll();
    }

    @GET
    @Path("/{idAdmin}")
    public Admin getById(@PathParam("idAdmin") Long id) {

        return ad.getById(id);
    }

    @POST
    public Admin add(Admin admin) {
      return ad.add(admin);
    }

    @PUT
    @Path("/{idAdmin}")
    public Admin update(Admin admin, @PathParam("idAdmin") Long id) {
        admin.setId(id);
       return ad.update(admin);

    }

    @DELETE
    @Path("/{idAdmin}")
    public boolean delete(@PathParam("idAdmin") Long id) {
      return ad.remove(ad.getById(id));
    }
}
