package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/users")
@CrossOrigin("*")
public class UserControllerImpl implements UserController{



    private final UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(dto));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @Override
    @PutMapping
    public ResponseEntity<UserDto> update(@RequestBody UserDto dto) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(userService.update(dto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


}