package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userRegistration")
    public String userRegistration(@RequestBody UserData userData) {
        try {
            userService.register(userData);
            return "Success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping("/findAllUsers")
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

}
