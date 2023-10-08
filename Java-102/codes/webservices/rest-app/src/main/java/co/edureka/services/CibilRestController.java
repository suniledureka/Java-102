package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/cibil")
public class CibilRestController {
	@GET
	@Produces("text/plan")
	@Path("/score")
	public String findCibilScore(@QueryParam("name") String customerName, @QueryParam("pan") String pan){
		  //logic to find the cibil score from DB
		  if(pan.length() == 10)
		    return "Hi "+customerName+", your PAN is "+pan+" and your CIBIL SCORE is 795";
		  return "Hi "+customerName+", submitted PAN ("+pan+") is NOT PALID";
		}			
}
