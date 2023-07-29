package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.RFID_User;
import com.mars.mars_backend.Entity.User;
import com.mars.mars_backend.Interface.RFIDUserRepository;
import com.mars.mars_backend.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class RFIDUserService {
    @Autowired
    RFIDUserRepository userRepo;

    @RequestMapping(value="/rfidusers",method = RequestMethod.GET)
    public List<RFID_User> getUsers(){
        return userRepo.getAllUsers();
    }
    @RequestMapping(value="/rfiduser/{id}",method = RequestMethod.GET)
    public RFID_User searchBotById(@PathVariable("id") Long macid){
        return userRepo.searchUserByMachine(macid);
    }

    @RequestMapping(value="/rfiduser/{mac_id}/{rfid}",method = RequestMethod.GET)
    public RFID_User searchBotByIdAndOwner(@PathVariable("mac_id") Long macid,@PathVariable("rfid") String rfid){
        return userRepo.searchUserByRFIDAndMachine(rfid,macid);
    }
    @RequestMapping(value="/rfiduser",method= RequestMethod.POST)
    public RFID_User addBot(@RequestBody RFID_User user){
        userRepo.saveAndFlush(user);
        return user;
    }

    @RequestMapping(value="/rfiduser/{id}",method= RequestMethod.PUT)
    public int updateUser(@PathVariable("id") long id,@RequestBody RFID_User user) {
        try{
            userRepo.updateUser(
                    id,
                    user.getBot_id(),
                    user.getRfid(),
                    user.getName(),
                    user.getDesignation()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
}
