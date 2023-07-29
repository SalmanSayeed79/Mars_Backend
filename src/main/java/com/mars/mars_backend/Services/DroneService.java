package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Drone;
import com.mars.mars_backend.Entity.User;
import com.mars.mars_backend.Interface.DroneRepository;
import com.mars.mars_backend.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class DroneService {
    @Autowired
    DroneRepository droneRepo;

    @RequestMapping(value="/drones",method = RequestMethod.GET)
    public List<Drone> getUsers(){
        return droneRepo.getAllDrones();
    }
    @RequestMapping(value="/drone/{id}",method = RequestMethod.GET)
    public Drone searchBotById(@PathVariable("id") String ownerEmail){
        return droneRepo.getDroneByUser(ownerEmail);
    }
    @RequestMapping(value="/drone",method= RequestMethod.POST)
    public Drone addBot(@RequestBody Drone drone){
        droneRepo.saveAndFlush(drone);
        return drone;
    }

    @RequestMapping(value="/drone/{id}",method= RequestMethod.PUT)
    public int updateUser(@PathVariable("id") long id,@RequestBody Drone drone) {
        try{
            droneRepo.updateUser(
                    id,
                    drone.getOwnerEmail(),
                    drone.getUrl()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
}
