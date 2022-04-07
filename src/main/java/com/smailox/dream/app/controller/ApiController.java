package com.smailox.dream.app.controller;

import com.smailox.dream.app.model.User;
import com.smailox.dream.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping(value = "/admin")
    public String getPageAdmin(){
        return "Welcome To Admin Page";
    }

    @GetMapping(value = "/user")
    public String getPageUser(){
        return "Welcome To user Page";
    }


    @GetMapping(value = {"/","/guest"})
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User>    getAllUser(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String  saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved...";
    }


    @PutMapping(value="/update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user){
        User userUpdate = userRepo.findById(id).get();

        userUpdate.setFirstName(user.getFirstName());
        userUpdate.setLastName(user.getLastName());
        userRepo.save(userUpdate);
        return "user updated ...";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
        return "user deleted ...";
    }
}
