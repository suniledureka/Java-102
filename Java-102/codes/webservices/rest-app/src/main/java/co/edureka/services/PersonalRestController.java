package co.edureka.services;

import java.util.Calendar;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/personal")
public class PersonalRestController {
	@GET
	@Produces("text/plain")
	@Path("/age/{name}/{yob}")
	public String calculateAge(@PathParam("name") String name, @PathParam("yob") Integer yob)
	{
		if(isValidYoB(yob)) {
			int age = getAge(yob);
			return "Hello "+name+", you are "+age+ " years of age!!";
		}else {
			return "Hello "+name+", your Year of Birth is NOT Valid";
		}
	}

	private boolean isValidYoB(Integer yob) {
		Calendar calendar = Calendar.getInstance();
		int current_year = calendar.get(Calendar.YEAR);
		return (yob < current_year)?true:false;
	}
	
	private int getAge(int yob) {
		Calendar calendar = Calendar.getInstance();
		int current_year = calendar.get(Calendar.YEAR);
		return current_year-yob;
	}
}
