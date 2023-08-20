package com.example.Validation.controller;

import com.example.Validation.controller.valid.UserNameConstraint;
import com.example.Validation.dto.UserCreateDTO;
import com.example.Validation.mode.User;
import com.example.Validation.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserCreateDTO> createUser(@Valid @RequestBody UserCreateDTO userCreateDTO) {
        UserCreateDTO resultPersonel = userService.createUser(userCreateDTO);
        return ResponseEntity.ok(resultPersonel);
    }

}
