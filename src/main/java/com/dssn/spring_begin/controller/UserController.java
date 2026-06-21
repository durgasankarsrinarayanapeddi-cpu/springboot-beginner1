package com.dssn.spring_begin.controller;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dssn.spring_begin.model.Users;
import com.dssn.spring_begin.services.UserService;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/users")//all  the apis with /api/users are handled by this controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {//the userService parameter ie list is gen by springbbot from the userservice module
        this.userService = userService;
    }
    @GetMapping
    public List<Users> getAllUser(){
        return userService.getAllUser();

    }
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable int id){
        
        Users res= userService.getUserById(id);
        if(res!=null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();

    }
    @PostMapping
    public Users addNewUsers(@RequestBody Users user){
        return userService.addNewUser(user);
    }

    @GetMapping("/randomUser")
    public Users randomUser(){
        return userService.randomUser();
    }
    
}
