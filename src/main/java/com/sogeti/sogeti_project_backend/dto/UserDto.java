package com.sogeti.sogeti_project_backend.dto;

import com.sogeti.sogeti_project_backend.models.Title;

import java.util.List;

public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private List<Title> titles;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String email, String userName, String password, List<Title> titles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.titles = titles;
    }

    public UserDto(int userId, String firstName, String lastName, String email, String userName, String password, List<Title> titles) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.titles = titles;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
