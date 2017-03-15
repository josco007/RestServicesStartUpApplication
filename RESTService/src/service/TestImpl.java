package service;


import java.util.List;

import javax.ejb.EJB;

import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import model.facade.SessionEJBLocal;


@Stateless
@Path("test")

public class TestImpl {


    @EJB(beanName = "SessionEJB")

    SessionEJBLocal mySessionBean;


    @GET
    @Produces(value = { "application/json", "application/xml" })
    @Path("/getTest")
    public String getTest() {
        return "{\"test\":\"this is a test\"}";
    }


}
