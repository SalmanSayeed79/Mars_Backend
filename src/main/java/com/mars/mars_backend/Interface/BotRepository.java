package com.mars.mars_backend.Interface;

import com.mars.mars_backend.Entity.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface BotRepository extends JpaRepository<Bot,Long> {
    @Query(value = "SELECT * FROM  bot",nativeQuery = true)
    List<Bot> getAllBots();

    @Query(value = "SELECT * FROM  bot a  WHERE   a.bot_id = ?1",nativeQuery = true)
    Bot searchBotByID(Long botId);
    @Transactional
    @Modifying
    @Query(value="UPDATE bot SET name = :name, image=:img, lat=:lat, lng=:lng  WHERE bot_id= :id",nativeQuery = true)
    int updateBot(Long id, String name, String img, Double lat,Double lng);

    @Transactional
    @Modifying
    @Query(value="UPDATE bot SET lat=:lat, lng=:lng  WHERE bot_id= :id",nativeQuery = true)
    int updateBotLocation(Long id, Double lat,Double lng);
}
