package com.example.Users.MovieUsers.DAO;

import lombok.Data;

@Data
public class UserDAO
{
    private Long Id;
    private String status;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "Id=" + Id +
                ", status='" + status + '\'' +
                '}';
    }
}
