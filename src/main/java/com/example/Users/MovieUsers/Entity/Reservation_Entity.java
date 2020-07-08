package com.example.Users.MovieUsers.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Reservation_Entity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String movie_name;
    private String movie_hero;
    private float rating;
    private String theater_name;
    private String rsvd_date;
    private String rsvd_time;
    private String ticket_count;
    private String purchased_date;
    private String purchased_time;
    private String fname;
    private String lname;
    private Integer age;
    private String email;
}
