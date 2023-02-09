package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.Temperature;
import com.mars.mars_backend.Interface.BotRepository;
import com.mars.mars_backend.Interface.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class TempratureService {
    @Autowired
    TemperatureRepository tempRepo;
    @RequestMapping(value="/temps",method = RequestMethod.GET)
    public List<Temperature> getTemps(){
        return tempRepo.getAllTemp();
    }

    @RequestMapping(value="/temp",method= RequestMethod.POST)
    public Temperature addTemp(@RequestBody Temperature temp){
        System.out.println(temp);
        tempRepo.saveAndFlush(temp);
        return temp;
    }
}
