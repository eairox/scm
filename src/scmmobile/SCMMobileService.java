package scmmobile;

/**
* @author Crunchify.com
*/

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/myservice")
public class SCMMobileService {
	@GET
	@Produces("application/json")
	public Person convertCtoF() {

		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		
		Person p = new Person();
		p.name = "Umesh Garg";
		p.city = "Sunnyvale";
				
				
		
		return p;
	}

}