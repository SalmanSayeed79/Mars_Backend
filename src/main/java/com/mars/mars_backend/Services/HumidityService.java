package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Humidity;
import com.mars.mars_backend.Interface.HumidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class HumidityService {
    @Autowired
    HumidityRepository humRepo;

    @RequestMapping(value="/hums",method= RequestMethod.GET)
    public List<Humidity> getHums(){return humRepo.getAllHum();}

    @RequestMapping(value="hum",method = RequestMethod.POST)
    public Humidity addHum(Humidity hum){
        humRepo.saveAndFlush(hum);
        return hum;
    }
}
