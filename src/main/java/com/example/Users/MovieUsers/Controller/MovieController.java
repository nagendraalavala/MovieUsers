package com.example.Users.MovieUsers.Controller;

import com.example.Users.MovieUsers.DAO.Reservation_DAO;
import com.example.Users.MovieUsers.DTO.MovieDTO;
import com.example.Users.MovieUsers.Mail.EmailService;
import com.example.Users.MovieUsers.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController
{
    @Autowired
    private MovieService movieService;

    @PostMapping("/newReservation")
    public Reservation_DAO newReser(MovieDTO movieDTO)
    {
        return movieService.createReservation(movieDTO);
    }

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {

        emailService.sendMail("nagendra.alavala@gmail.com", "Test Subject", "Test mail");


        return "emailsent";
    }
}
