package com.innowise.ryabov.cos3.service.serviceImpl;
import com.innowise.ryabov.cos3.dto.UserDto;
import com.innowise.ryabov.cos3.entity.User;
import com.innowise.ryabov.cos3.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements com.innowise.ryabov.cos3.service.UserService {
    UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
