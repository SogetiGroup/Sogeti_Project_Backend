package com.sogeti.sogeti_project_backend.repository;

import com.sogeti.sogeti_project_backend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
