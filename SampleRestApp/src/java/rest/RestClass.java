/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.ArrayList;
import java.util.Collection;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("restful")
public class RestClass {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestClass
     */
    public RestClass() {
    }

    /**
     * Retrieves representation of an instance of rest.RestClass
     * @return an instance of java.lang.String
     */
   @Path("/{uname}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(@PathParam("uname") String cname) {
        //TODO return proper representation object
       // throw new UnsupportedOperationException();
    
     return "<h2>Hello World of Rest to "+ cname + " !</h2>";
    }

    @Path("special/{fname}/{lname}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String saySpecialHello(@PathParam("fname") String fname, @PathParam("lname") String lname) {
        //TODO return proper representation object
       // throw new UnsupportedOperationException();
    
     return "<h2>Special Hello World of Rest "+ fname + " "+ lname + " !</h2>";
    }
    
    @POST
    @Path("umnames")
    @Produces(MediaType.APPLICATION_JSON)  
    @Consumes(MediaType.APPLICATION_JSON)       
   public Collection<String> getUCaseNames(Collection<String> names)
    {
        Collection<String> unames = new ArrayList<String>();
        
        for(String nm : names)
        {
            unames.add(nm.toUpperCase());
        }
        
        return unames;
    }
    
}
