package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.models.User;
import com.sogeti.sogeti_project_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User user) {
        User saved = userRepository.save(user);
        return saved;
    }

    @Override
    public boolean delete(Integer userId) {
        userRepository.deleteById(userId);
        return !userRepository.existsById(userId);
    }
}
