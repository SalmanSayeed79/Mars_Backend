package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Flame;
import com.mars.mars_backend.Interface.FlameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class FlameService {
    @Autowired
    FlameRepository flameRepo;

    @RequestMapping(value="/flames",method = RequestMethod.GET)
    public List<Flame> getAllFlames(){return flameRepo.getAllFlames();}
    @RequestMapping(value="/flame",method = RequestMethod.POST)
    public Flame addFlame(@RequestBody Flame flame){
        flameRepo.saveAndFlush(flame);
        return flame;
    }
}
