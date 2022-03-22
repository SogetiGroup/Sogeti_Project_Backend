package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataConstraintViolationException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.models.User;

import java.util.List;

public interface UserService {

    UserDto create (UserDto dto) throws ArgumentException;
    UserDto findById(Integer userId) throws ArgumentException, DataNotFoundException;
    List<UserDto> findAll();
    UserDto update(Integer userId, UserDto dto) throws DataNotFoundException, ArgumentException;
    void delete (Integer userId) throws DataNotFoundException, DataConstraintViolationException;
}
