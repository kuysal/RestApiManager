package com.kry.restapimanager.service;

import com.kry.restapimanager.model.RestApiEntry;
import com.kry.restapimanager.repository.RestApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestApiServiceImpl implements RestApiService{

    @Autowired
    private RestApiRepository restApiRepository;

    @Override
    public RestApiEntry saveRestApiEntry(RestApiEntry restApiEntry) {
        return restApiRepository.save(restApiEntry);
    }

    @Override
    public List<RestApiEntry> getAllServices() {
        return restApiRepository.findAll();
    }
}
