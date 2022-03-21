package com.sogeti.sogeti_project_backend.repository;

import com.sogeti.sogeti_project_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
