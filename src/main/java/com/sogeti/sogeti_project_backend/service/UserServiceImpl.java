package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.dto.UserDto;
import com.sogeti.sogeti_project_backend.models.Invitations;
import com.sogeti.sogeti_project_backend.models.User;
import com.sogeti.sogeti_project_backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public UserDto create(UserDto dto) throws ArgumentException {
       // if (dto == null) throw new ArgumentException("User data should not be null");
       // if (dto.getUserId() != 0) throw new ArgumentException("User Id should be null");
        User saved = mapper.map(dto, User.class);
        User result = userRepository.save(saved);
        return mapper.map(result, UserDto.class);
    }

    @Override
    @Transactional
    public UserDto findById(Integer userId) throws DataNotFoundException, ArgumentException {
        if (userId == null || userId == 0) throw new ArgumentException("User Id should not be null or 0");
        //Optional<User> result = userRepository.findById(userId);
        User result = userRepository.findById(userId).orElseThrow(() -> new DataNotFoundException("User not found"));
        return mapper.map(result, UserDto.class);

    }

    @Override
    public List<UserDto> findAll() {
        List<User> list = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(list::add);
        return list.stream().map(category -> mapper.map(category, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public UserDto update(Integer userId, UserDto dto) throws DataNotFoundException {
        User userEntity = userRepository.findById(userId).orElseThrow(() -> new DataNotFoundException("User does not exist with id :" + userId));

        userEntity.setFirstName(dto.getFirstName());
        userEntity.setLastName(dto.getLastName());
        userEntity.setEmail(dto.getEmail());
        userEntity.setUserName(dto.getUserName());
        userEntity.setPassword(dto.getPassword());
        userEntity.setTitles(dto.getTitles());

        return dto;

//        if (dto == null) throw new ArgumentException("User data should not be null");
//        if (dto.getUserId() == 0) throw new ArgumentException("User Id should not be null");
//
//        //User entity = mapper.map(dto, User.class);
//
//        User userEntity = mapper.map(dto, User.class);
//        User result = userRepository.save(userEntity);
//        return mapper.map(result, UserDto.class);



    }

    @Override
    @Transactional
    public void delete(Integer userId) throws DataNotFoundException {
        //userRepository.delete(mapper.map(findById(userId), User.class));
        //return false;
        userRepository.deleteById(userId);
        userRepository.existsById(userId);
    }



}
