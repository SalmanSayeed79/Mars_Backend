package com.mars.mars_backend.Services;

import com.mars.mars_backend.Entity.Bot;
import com.mars.mars_backend.Entity.User;
import com.mars.mars_backend.Interface.BotRepository;
import com.mars.mars_backend.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class UserService {
    @Autowired
    UserRepository userRepo;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        return userRepo.getAllUsers();
    }
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public User searchBotById(@PathVariable("id") Long id){
        return userRepo.searchUserByID(id);
    }
    @RequestMapping(value="/user",method= RequestMethod.POST)
    public User addBot(@RequestBody User user){
        userRepo.saveAndFlush(user);
        return user;
    }

    @RequestMapping(value="/user/{id}",method= RequestMethod.PUT)
    public int updateUser(@PathVariable("id") long id,@RequestBody User user) {
        try{
            userRepo.updateUser(
                    id,
                    user.getName(),
                    user.getEmail(),
                    user.getResearcher(),
                    user.getUser_type(),
                    user.getInstitute(),
                    user.getAddress(),
                    user.getImage()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }

}
