package com.user.user.Controller;
import com.user.user.Model.User;
import com.user.user.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    

    @Autowired
    UserService userService;
    public UserController(){

    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
       
    }
    @GetMapping("getUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
