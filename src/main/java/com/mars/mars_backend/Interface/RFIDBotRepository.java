package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Drone;
import com.mars.mars_backend.Entity.RFID_Bot;
import com.mars.mars_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RFIDBotRepository extends JpaRepository<RFID_Bot,Long> {
    @Query(value = "SELECT * FROM  rfid_bot",nativeQuery = true)
    List<RFID_Bot> getAllBots();

    @Query(value = "SELECT * FROM  rfid_bot a  WHERE   a.owner_email = ?1",nativeQuery = true)
    RFID_Bot searchRFIDByOwner(String ownerEmail);


    @Transactional
    @Modifying
    @Query(value="UPDATE rfid_bot SET owner_email = :ownerEmail,title=:title,subtitle=:sub  WHERE bot_id= :id",nativeQuery = true)
    int updateUser(Long id, String ownerEmail, String title, String sub);

}
