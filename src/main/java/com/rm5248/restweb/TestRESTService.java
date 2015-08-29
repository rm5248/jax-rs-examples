package com.rm5248.restweb;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path( "/" )
public class TestRESTService {
    
    @GET
    @Path( "hello/{name}" )
    @Produces( "application/json" )
    public Response sayHello( @PathParam( "name" ) final String name){
        Map<String,String> responseData = new HashMap<String,String>();
        
        responseData.put( "Hello", name );
        responseData.put( "Directions", "Change the URL to get a differerent name!" );
        
        return Response.ok( responseData ).build();
    }
    
    @GET
    @Path( "textonly" )
    public Response sendText(){
        return Response.ok( "Text data" ).build();
    }
    
    @GET
    @Path( "hello" )
    public Response sayHelloQueryString( @QueryParam( "name" ) final String name ){
        Map<String,String> responseData = new HashMap<String,String>();
        
        responseData.put( "Hello", name );
        responseData.put( "Directions", "Change the query string to get a differerent name!" );
        
        return Response.ok( responseData ).build();
    }
    
    @POST
    @Path( "formdata" )
    @Consumes( MediaType.APPLICATION_FORM_URLENCODED )
    public Response sendDataToServer( @FormParam( "name" ) final String name ){
        Map<String,String> responseData = new HashMap<String,String>();
        
        responseData.put( "Hello", name );
        responseData.put( "Directions", "Change the form parameters to get a differerent name!" );
        
        return Response.ok( responseData ).build();
    }
}
