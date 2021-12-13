package com.kry.restapimanager.service;

import com.kry.restapimanager.model.RestApiEntry;

import java.util.List;

public interface RestApiService {

    public RestApiEntry saveRestApiEntry(RestApiEntry restApiEntry);

    public List<RestApiEntry> getAllServices();
}
