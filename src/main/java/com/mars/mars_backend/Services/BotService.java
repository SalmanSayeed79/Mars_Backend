package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Interface.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class BotService {
    @Autowired
    BotRepository botRepo;

    @RequestMapping(value="/bots",method = RequestMethod.GET)
    public List<Bot> getBots(){
        return botRepo.getAllBots();
    }
    @RequestMapping(value="/bot/{id}",method = RequestMethod.GET)
    public Bot searchBotById(@PathVariable("id") Long id){
        return botRepo.searchBotByID(id);
    }
    @RequestMapping(value="/bot",method= RequestMethod.POST)
    public Bot addBot(@RequestBody Bot bot){
        botRepo.saveAndFlush(bot);
        return bot;
    }

    @RequestMapping(value="/bot/{id}",method= RequestMethod.PUT)
    public int updateBot(@PathVariable("id") long id,@RequestBody Bot bot) {
        try{
            botRepo.updateBot(
                    id,
                    bot.getName(),
                    bot.getImage(),
                    bot.getLat(),
                    bot.getLng()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
    @RequestMapping(value="/bot/location/{id}",method= RequestMethod.PUT)
    public int updateBotLocation(@PathVariable("id") Long id,@RequestBody Bot bot) {
        System.out.println(bot.getName());
        try{
            botRepo.updateBotLocation(
                    id,
                    bot.getLat(),
                    bot.getLng()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
}
