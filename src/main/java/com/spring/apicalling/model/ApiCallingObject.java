package com.spring.apicalling.model;

import java.util.Map;

import lombok.Data;

 @Data
public class ApiCallingObject {
    private String id;
    private String name;
    private Map<String, Object> data;
}
