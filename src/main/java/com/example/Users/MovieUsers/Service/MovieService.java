package com.example.Users.MovieUsers.Service;

import com.example.Users.MovieUsers.DAO.Reservation_DAO;
import com.example.Users.MovieUsers.DAO.StatusDAO;
import com.example.Users.MovieUsers.DTO.MovieDTO;
import com.example.Users.MovieUsers.DTO.UserDTO;
import com.example.Users.MovieUsers.Entity.Reservation_Entity;
import com.example.Users.MovieUsers.Repository.MovieRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService
{

    private MovieRepo movieRepo;
    private Reservation_DAO reservation_dao;
    private ModelMapper modelMapper;
    private UserDTO userDTO;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
        this.reservation_dao = new Reservation_DAO();
        this.modelMapper = new ModelMapper();
        this.userDTO = new UserDTO();
    }

    //create a reservation

    public Reservation_DAO createReservation(MovieDTO movieDTO)
    {
        Reservation_Entity reservation_entity = modelMapper.map(movieDTO, Reservation_Entity.class);
        movieRepo.save(reservation_entity);
        Optional<Reservation_Entity> new_reservation = movieRepo.findById(reservation_entity.getId());
        if (new_reservation.isPresent())
        {
            Reservation_Entity reservation_entity1;
            reservation_entity1 = new_reservation.get();
            reservation_dao.setId(reservation_entity1.getId());
            reservation_dao.setMovie_name(reservation_entity1.getMovie_name());
            reservation_dao.setMovie_hero(reservation_entity1.getMovie_hero());
            reservation_dao.setRating(reservation_entity1.getRating());
            reservation_dao.setTheater_name(reservation_entity1.getTheater_name());
            reservation_dao.setRsvd_date(reservation_entity1.getRsvd_date());
            reservation_dao.setRsvd_time(reservation_entity1.getRsvd_time());
            reservation_dao.setTicket_count(reservation_entity1.getTicket_count());
            reservation_dao.setFname(reservation_entity1.getFname());
            reservation_dao.setLname(reservation_entity1.getLname());
            reservation_dao.setAge(reservation_entity1.getAge());
            reservation_dao.setEmail(reservation_entity1.getEmail());

            return reservation_dao;
        }
        else
        {
            throw new  RuntimeException("Something went wrong. Please try again later");
        }

    }





}
