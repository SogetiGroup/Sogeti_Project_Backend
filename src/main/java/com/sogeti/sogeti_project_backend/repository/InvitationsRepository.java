package com.sogeti.sogeti_project_backend.repository;

import com.sogeti.sogeti_project_backend.models.Invitations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface InvitationsRepository extends CrudRepository<Invitations, Integer> {
}
