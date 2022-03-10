package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.models.User;
import com.sogeti.sogeti_project_backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/event/api/vi/users")
public class UserControllerImpl implements UserController{


    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(dto));
    }

    @Override
    public ResponseEntity<UserDto> findById(Integer userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @Override
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @Override
    public ResponseEntity<UserDto> update(UserDto dto) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(userService.update(dto));
    }

    @Override
    public ResponseEntity<Void> delete(Integer userId) {

        userService.delete(userId);
        return ResponseEntity.noContent().build();
    }


}