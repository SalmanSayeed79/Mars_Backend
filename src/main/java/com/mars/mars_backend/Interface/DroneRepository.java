package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DroneRepository extends JpaRepository<Drone,Long> {
    @Query(value = "SELECT * FROM  drone",nativeQuery = true)
    List<Drone> getAllDrones();

    @Query(value = "SELECT * FROM  drone a  WHERE   a.owner_email = ?1",nativeQuery = true)
    Drone getDroneByUser(String owner_email);

    @Transactional
    @Modifying
    @Query(value="UPDATE drone SET owner_email=:ownerEmail,url=:url  WHERE bot_id= :id",nativeQuery = true)
    int updateUser(Long id, String ownerEmail, String url);
}
