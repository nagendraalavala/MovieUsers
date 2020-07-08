package com.example.Users.MovieUsers.Controller;

import com.example.Users.MovieUsers.DAO.StatusDAO;
import com.example.Users.MovieUsers.DTO.UserDTO;
import com.example.Users.MovieUsers.Entity.UserEntity;
import com.example.Users.MovieUsers.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService movieService;

    @PostMapping("/new")
    public StatusDAO newUser(@RequestBody UserDTO userDTO)

    {
        return movieService.saveUser(userDTO);
    }

    @GetMapping("/")
    public List<UserEntity> findAll()
    {
        return movieService.allUsers();
    }
}
