package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.models.Invitations;
import com.sogeti.sogeti_project_backend.models.User;
import com.sogeti.sogeti_project_backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{


    private final ModelMapper mapper;
    private final UserRepository userRepository;

    public UserServiceImpl(ModelMapper mapper, UserRepository userRepository) {
        this.mapper = mapper;
        this.userRepository = userRepository;
    }


    @Override
    public UserDto create(UserDto dto) {
        User saved = mapper.map(dto, User.class);
        User result = userRepository.save(saved);
        return mapper.map(result, UserDto.class);
    }

    @Override
    public UserDto findById(Integer userId) {
        Optional<User> result = userRepository.findById(userId);
        return mapper.map(result, UserDto.class);
    }

    @Override
    public List<UserDto> findAll() {

        List<User> list = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(list::add);
        return list.stream().map(category -> mapper.map(category, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public UserDto update(UserDto dto) {

        User entity = mapper.map(dto, User.class);
        User result = userRepository.save(entity);

        return mapper.map(result, UserDto.class);

    }

    @Override
    public void delete(Integer userId) {

        userRepository.delete(mapper.map(findById(userId), User.class));
    }


}
