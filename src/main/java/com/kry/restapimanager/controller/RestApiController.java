package com.kry.restapimanager.controller;

import com.kry.restapimanager.model.RestApiEntry;
import com.kry.restapimanager.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api")
@CrossOrigin
public class RestApiController {

    @Autowired
    private RestApiService restApiService;

    @GetMapping("/hello")
    public String message() {
        return "Hello from Spring Application!";
    }

    @PostMapping("/add")
    public String restApiService(@RequestBody RestApiEntry restApiEntry) {
        restApiService.saveRestApiEntry(restApiEntry);
        return "New Service added!";
    }

    @PostMapping("/getAllServices")
    public List<RestApiEntry> getAllServices() {
        return restApiService.getAllServices();
    }
}
