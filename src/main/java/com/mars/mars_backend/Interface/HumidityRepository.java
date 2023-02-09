package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.Humidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HumidityRepository extends JpaRepository<Humidity,Long> {
    @Query(value = "SELECT * FROM  hum",nativeQuery = true)
    List<Humidity> getAllHum();
}
