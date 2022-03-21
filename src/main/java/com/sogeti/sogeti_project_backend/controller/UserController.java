package com.sogeti.sogeti_project_backend.controller;


import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataConstraintViolationException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserController {

    ResponseEntity<UserDto> create (UserDto dto) throws ArgumentException;
    ResponseEntity<UserDto> findById(Integer id) throws DataNotFoundException, ArgumentException;
    ResponseEntity<List<UserDto>>  getAll();
    ResponseEntity<UserDto> update(UserDto dto) throws DataNotFoundException, ArgumentException;
    ResponseEntity<Void> delete (Integer userId) throws DataNotFoundException, DataConstraintViolationException;

}
