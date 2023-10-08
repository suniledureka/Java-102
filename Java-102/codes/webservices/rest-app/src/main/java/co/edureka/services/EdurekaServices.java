package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/plain")
	public String indiaCustomerServices() {
		return "Welcome to INDIA Customer Service of Edureka";
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalCustomerServices() {
		return "<p style=color:blue;font-size:20px;text-align:center>Welcome to INDIA Customer Service of Edureka</p>";
	}	
}
