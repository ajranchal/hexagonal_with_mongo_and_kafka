package com.hexagonal.infrastructure.controller.api.rest.adapter;

import com.hexagonal.domain.ports.HelloWorldPrimaryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldAdapter {

    @Autowired
    private HelloWorldPrimaryPort helloWorldPrimaryPort;

    public String getHelloWorld(String language){

        return helloWorldPrimaryPort.helloWorld(language);
    }

}