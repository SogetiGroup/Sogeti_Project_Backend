package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.models.User;

import java.util.List;

public interface UserService {

    UserDto create (UserDto dto);
    UserDto findById(Integer userId);
    List<UserDto> findAll();
    UserDto update(UserDto dto);
    void delete (Integer userId);
}
