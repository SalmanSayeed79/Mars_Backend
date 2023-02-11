package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Sound;
import com.mars.mars_backend.Interface.SoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class SoundService {
    @Autowired
    SoundRepository soundRepo;
    @RequestMapping(value="/sounds",method = RequestMethod.GET)
    public List<Sound> getAllSounds(){return soundRepo.getAllSounds();}

    @RequestMapping(value="/sound",method = RequestMethod.POST)
    public Sound addSound(@RequestBody Sound sound){
        soundRepo.saveAndFlush(sound);
        return sound;
    }
}
