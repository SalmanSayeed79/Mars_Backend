package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Sound;
import com.mars.mars_backend.Interface.SoundRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class SoundService {
    SoundRepository soundRepo;
    @RequestMapping(value="/sounds",method = RequestMethod.GET)
    public List<Sound> getAllSounds(){return soundRepo.getAllSounds();}

    @RequestMapping(value="/sound",method = RequestMethod.POST)
    public Sound addSound(Sound sound){
        soundRepo.saveAndFlush(sound);
        return sound;
    }
}
