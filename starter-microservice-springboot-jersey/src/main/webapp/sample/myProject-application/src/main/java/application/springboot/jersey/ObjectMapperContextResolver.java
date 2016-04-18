package application.springboot.jersey;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {

    private final ObjectMapper mapper;

    @Autowired
    public ObjectMapperContextResolver(ObjectMapper objectMapper) {
        this.mapper = objectMapper;
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
    	System.out.println("********* " + mapper.toString());
        return mapper;
    }
}
