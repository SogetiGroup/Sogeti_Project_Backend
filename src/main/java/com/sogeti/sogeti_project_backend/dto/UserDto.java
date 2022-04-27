package com.sogeti.sogeti_project_backend.dto;

import com.sogeti.sogeti_project_backend.models.Title;
import com.sogeti.sogeti_project_backend.models.UserTitle;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private UserTitle userTitle;
    private Integer userLevel;
    private String userName;
    private String password;

    //private UserRole userRole;
}
