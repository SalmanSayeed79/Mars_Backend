package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.RFID_User;
import com.mars.mars_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RFIDUserRepository extends JpaRepository<RFID_User,Long> {
    @Query(value = "SELECT * FROM  rfid_user",nativeQuery = true)
    List<RFID_User> getAllUsers();

    @Query(value = "SELECT * FROM  rfid_user a  WHERE   a.bot_id = ?1",nativeQuery = true)
    RFID_User searchUserByMachine(Long mac_id);

    @Query(value = "SELECT * FROM  rfid_user a  WHERE   a.rfid = ?1 AND a.bot_id=?2",nativeQuery = true)
    RFID_User searchUserByRFIDAndMachine(String rfid,Long macId);

    @Transactional
    @Modifying
    @Query(value="UPDATE rfid_user SET name = :name,rfid=:rfid,bot_id=:macId,position=:pos  WHERE rfid_user_id= :id",nativeQuery = true)
    int updateUser(Long id, Long macId,String rfid, String name,String pos);

}
