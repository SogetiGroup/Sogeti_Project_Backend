package com.sogeti.sogeti_project_backend.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Data
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
    private UserTitle userTitle;
    private Integer userLevel;
    private String userName;
    private String password;

    //private UserRole userRole;


   /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_title", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "title_id"))

   private List<Title> titles;*/


}
