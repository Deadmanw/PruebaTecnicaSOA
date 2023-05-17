package com.example.tecnical.test.conf;


import com.example.tecnical.test.impl.CrudServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

@Configuration
public class ApplicationConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint (CrudServiceImpl crudService){
        Endpoint endpoint= new EndpointImpl(bus,crudService, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/CrudService");
        return endpoint;
    }


}
