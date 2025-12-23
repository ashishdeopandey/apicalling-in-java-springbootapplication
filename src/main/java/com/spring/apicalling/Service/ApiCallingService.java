package com.spring.apicalling.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.apicalling.model.ApiCallingObject;

@Service
public class ApiCallingService {
     private final RestTemplate restTemplate = new RestTemplate();

    public ApiCallingObject[] getObjects() {
    return restTemplate.getForObject(
        "https://api.restful-api.dev/objects",
        ApiCallingObject[].class
    );
}
}
