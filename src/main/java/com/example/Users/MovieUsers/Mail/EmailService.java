package com.example.Users.MovieUsers.Mail;

import com.example.Users.MovieUsers.DAO.Reservation_DAO;
import lombok.var;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailService {

    private Reservation_DAO reservation_dao;

    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail( String toEmail,String subject, String message) {

        var mailMessage = new SimpleMailMessage();

//        String toEmail = reservation_dao.getEmail();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);

        mailMessage.setFrom("nagendra.alavala@gmail.com");

        javaMailSender.send(mailMessage);
    }
}
