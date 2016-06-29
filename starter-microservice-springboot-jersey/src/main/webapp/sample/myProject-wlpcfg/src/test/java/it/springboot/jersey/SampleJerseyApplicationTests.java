
package it.springboot.jersey;

import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import it.EndpointTest;
import org.junit.Test;

//To test endpoint is working correctly 
public class SampleJerseyApplicationTests extends EndpointTest {
    @Test
    public void testJerseyApplication() {
    	//Assert the return string is as expect
        testEndpoint("/springbootjersey", "Hello from the SpringBoot Jersey endpoint!");
    }
}
