package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.models.User;
import com.sogeti.sogeti_project_backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/event/api/vi/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<User> create(@RequestBody User createForm){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(createForm));
    }








}