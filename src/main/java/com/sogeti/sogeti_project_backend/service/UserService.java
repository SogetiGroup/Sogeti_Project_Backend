package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.models.User;

public interface UserService {

    User create (User user);
    boolean delete (Integer userId);
}
