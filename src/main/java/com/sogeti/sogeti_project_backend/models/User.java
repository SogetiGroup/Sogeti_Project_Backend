package com.sogeti.sogeti_project_backend.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer userLevel;
    private String userName;
    private String password;

    //private UserRole userRole;


   @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_title", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "title_id"))

   private List<Title> titles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && Objects.equals(titles, user.titles) && Objects.equals(userLevel, user.userLevel) && Objects.equals(userName, user.userName) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, titles, userLevel, userName, password);
    }
}
