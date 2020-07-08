package com.example.Users.MovieUsers.DAO;

import com.example.Users.MovieUsers.DTO.UserDTO;
import lombok.Data;

@Data
public class Reservation_DAO
{
    private UserDTO userDTO;


    private Long Id;
    private String movie_name;
    private String movie_hero;
    private float rating;
    private String theater_name;
    private String rsvd_date;
    private String rsvd_time;
    private String ticket_count;
    private String fname;
    private String lname;
    private Integer age;
    private String email;

}
