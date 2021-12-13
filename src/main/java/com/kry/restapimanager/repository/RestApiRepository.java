package com.kry.restapimanager.repository;

import com.kry.restapimanager.model.RestApiEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestApiRepository extends JpaRepository<RestApiEntry, Integer> {
}
