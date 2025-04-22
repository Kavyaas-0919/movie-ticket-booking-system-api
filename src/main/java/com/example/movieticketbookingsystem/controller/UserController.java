package com.example.movieticketbookingsystem.controller;

import com.example.movieticketbookingsystem.entity.UserDetails;
import com.example.movieticketbookingsystem.entity.User;
import com.example.movieticketbookingsystem.service.UserService;
import com.example.movieticketbookingsystem.utility.ResponseStructure;
import com.example.movieticketbookingsystem.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final RestResponseBuilder restResponseBuilder;

    @PostMapping("/register")
    public ResponseEntity<ResponseStructure<UserDetails>> addUser(@RequestBody UserDetails user) {
        UserDetails userDetails = userService.addUser((user));
        return restResponseBuilder.sucess(HttpStatus.OK, "New User Details Has been", userDetails);

    }
}