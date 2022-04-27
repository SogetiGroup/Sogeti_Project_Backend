package com.sogeti.sogeti_project_backend.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
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


 /*   @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_title", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "title_id"))
    private List<Title> titles;*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return userId != null && Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
