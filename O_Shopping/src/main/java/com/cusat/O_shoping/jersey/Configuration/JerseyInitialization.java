package com.cusat.O_shoping.jersey.Configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import com.cusat.O_shoping.model.*;
import com.cusat.O_shoping.Resources.*;

public class JerseyInitialization extends ResourceConfig{
	public JerseyInitialization(){
		this.register(new JacksonJaxbJsonProvider(ObjectMapperFactory.create()));
		this.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        this.property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
	    this.packages(true,"com.cusat.O_shoping.Resources;");
	}

}
