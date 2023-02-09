package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.Sound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SoundRepository extends JpaRepository<Sound,Long> {
    @Query(value = "SELECT * FROM  sound",nativeQuery = true)
    List<Sound> getAllSounds();
}
