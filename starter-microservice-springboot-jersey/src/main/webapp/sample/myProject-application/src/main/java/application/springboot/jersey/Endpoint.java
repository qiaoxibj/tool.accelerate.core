
package application.springboot.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

//Define which URL to map to this class
@Component
@Path("/")
public class Endpoint {
	private ObjectMapper objectMapper;

	@Autowired
	public Endpoint(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	//Handling GET method, and return a welcome string
	@GET
	public String message() {
		return "Hello from the SpringBoot Jersey endpoint!";
	}
}
