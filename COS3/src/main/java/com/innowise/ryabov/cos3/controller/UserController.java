package com.innowise.ryabov.cos3.controller;

import com.innowise.ryabov.cos3.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(name = "/user")
public class UserController {
    UserService service;

    @GetMapping("/get")
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers().toString());
    }
}
