package com.innowise.ryabov.cos3.repository;

import com.innowise.ryabov.cos3.dto.UserDto;
import com.innowise.ryabov.cos3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
