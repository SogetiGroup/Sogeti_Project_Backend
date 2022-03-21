package com.sogeti.sogeti_project_backend.repository;

import com.sogeti.sogeti_project_backend.models.Invitations;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvitationsRepository extends JpaRepository<Invitations, Integer> {
}
