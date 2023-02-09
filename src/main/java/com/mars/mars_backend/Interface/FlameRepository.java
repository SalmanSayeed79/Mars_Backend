package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.Flame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlameRepository extends JpaRepository<Flame,Long> {
    @Query(value = "SELECT * FROM  flame",nativeQuery = true)
    List<Flame> getAllFlames();
}
