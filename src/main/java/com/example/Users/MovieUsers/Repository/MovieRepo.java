package com.example.Users.MovieUsers.Repository;

import com.example.Users.MovieUsers.Entity.Reservation_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Reservation_Entity, Long>
{

}
