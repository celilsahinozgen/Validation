package com.example.Validation.service;


import com.example.Validation.dto.UserCreateDTO;
import com.example.Validation.mode.User;
import com.example.Validation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    public UserCreateDTO createUser(UserCreateDTO userCreateDTO) {

        User user = modelMapper.map(userCreateDTO, User.class );

        return modelMapper.map(userRepository.save(user), UserCreateDTO.class);
    }



}
