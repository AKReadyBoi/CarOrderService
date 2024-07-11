package com.innowise.ryabov.cos3.service;
import com.innowise.ryabov.cos3.dto.UserDto;
import com.innowise.ryabov.cos3.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
}
