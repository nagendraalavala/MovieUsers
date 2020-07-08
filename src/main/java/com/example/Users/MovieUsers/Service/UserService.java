package com.example.Users.MovieUsers.Service;

import com.example.Users.MovieUsers.DAO.StatusDAO;
import com.example.Users.MovieUsers.DTO.UserDTO;
import com.example.Users.MovieUsers.Entity.UserEntity;
import com.example.Users.MovieUsers.Repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{

    private UserRepo movieRepo;
    private StatusDAO userDAO;
    private ModelMapper modelMapper;



    public UserService(UserRepo movieRepo)
    {
        this.movieRepo = movieRepo;
        this.userDAO = new StatusDAO();
        this.modelMapper = new ModelMapper();
    }


    //adduser
    public StatusDAO saveUser(UserDTO userDTO)
    {
        UserEntity user ;
        user = modelMapper.map(userDTO, UserEntity.class);
        movieRepo.save(user);
        Optional<UserEntity> newUser = movieRepo.findById(user.getId());
        if(newUser.isPresent())
        {
            UserEntity userEntity;
            userEntity = newUser.get();
            userDAO.setId(userEntity.getId());
            userDAO.setStatus("User Created");
            return userDAO;
        }
        else {
            throw new RuntimeException("User Already Presented");
        }

    }


    //findAllUsers
    public List<UserEntity> allUsers()
    {

        return movieRepo.findAll();
    }

    
}
