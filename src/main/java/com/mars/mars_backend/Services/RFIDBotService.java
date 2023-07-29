package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.RFID_Bot;
import com.mars.mars_backend.Entity.User;
import com.mars.mars_backend.Interface.RFIDBotRepository;
import com.mars.mars_backend.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class RFIDBotService {
    @Autowired
    RFIDBotRepository  botRepo;

    @RequestMapping(value="/rfidbots",method = RequestMethod.GET)
    public List<RFID_Bot> getUsers(){
        return botRepo.getAllBots();
    }
    @RequestMapping(value="/rfidbot/{id}",method = RequestMethod.GET)
    public RFID_Bot searchBotByOwner(@PathVariable("id") String ownerEmail){
        return botRepo.searchRFIDByOwner(ownerEmail);
    }
    @RequestMapping(value="/rfidbot",method= RequestMethod.POST)
    public RFID_Bot addBot(@RequestBody RFID_Bot bot){
        botRepo.saveAndFlush(bot);
        return bot;
    }

    @RequestMapping(value="/rfidbot/{id}",method= RequestMethod.PUT)
    public int updateUser(@PathVariable("id") long id,@RequestBody RFID_Bot bot) {
        try{
            botRepo.updateUser(
                    id,
                    bot.getOwnerEmail(),
                    bot.getTitle(),
                    bot.getSubtitle()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
}
