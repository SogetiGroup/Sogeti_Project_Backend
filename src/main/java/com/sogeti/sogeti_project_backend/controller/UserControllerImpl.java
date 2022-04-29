package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataConstraintViolationException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
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

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto dto) throws ArgumentException {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(dto));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable("id") Integer id) throws DataNotFoundException, ArgumentException {
        //return new ResponseEntity<UserDto>(userService.findById(id),HttpStatus.OK);
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable("id") Integer userId, @RequestBody UserDto dto) throws DataNotFoundException, ArgumentException {
        System.out.println("userId = " + userId);

        //return ResponseEntity.status(HttpStatus.NO_CONTENT).body(userService.update(dto));
        return ResponseEntity.ok(userService.update(userId, dto));

        //userService.update(dto);
        //return ResponseEntity.ok(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws DataNotFoundException, DataConstraintViolationException {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


}