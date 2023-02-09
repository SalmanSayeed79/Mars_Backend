package com.mars.mars_backend.Interface;



import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemperatureRepository extends JpaRepository<Temperature,Long> {
    @Query(value = "SELECT * FROM  temp",nativeQuery = true)
    List<Temperature> getAllTemp();
}
