
package application.springboot.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

//Map the 'springbootjersey' as root context and avoid conflict to other URL
@Component
@ApplicationPath("/springbootjersey")
public class JerseyConfig extends ResourceConfig {

	//Register Endpoint class to Jersey config
	public JerseyConfig() {
		register(Endpoint.class);
	}
}
