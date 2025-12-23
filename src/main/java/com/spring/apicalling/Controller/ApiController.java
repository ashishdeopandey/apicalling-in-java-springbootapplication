package com.spring.apicalling.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apicalling.Service.ApiCallingService;
import com.spring.apicalling.model.ApiCallingObject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "External APIs", description = "APIs consuming third-party services")
@RestController
@RequestMapping("/api/external")
public class ApiController {

    private final ApiCallingService ApicallinService;

    public ApiController(ApiCallingService ApicallinService) {
        this.ApicallinService = ApicallinService;
    }

    @Operation(
        summary = "Fetch objects from external API",
        description = "Calls https://api.restful-api.dev/objects and returns the response"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Successfully fetched data"),
        @ApiResponse(responseCode = "500", description = "External API error")
    })
    @GetMapping("/objects")
    public ApiCallingObject[] fetchObjects() {
        return ApicallinService.getObjects();
    }

    
}
