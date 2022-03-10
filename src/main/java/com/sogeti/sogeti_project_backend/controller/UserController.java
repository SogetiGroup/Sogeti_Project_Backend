package com.sogeti.sogeti_project_backend.controller;


import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserController {

    ResponseEntity<UserDto> create (UserDto dto);
    ResponseEntity<UserDto> findById(Integer userId);
    ResponseEntity<List<UserDto>>  getAll();
    ResponseEntity<UserDto> update(UserDto dto);
    ResponseEntity<Void> delete (Integer userId);

}
