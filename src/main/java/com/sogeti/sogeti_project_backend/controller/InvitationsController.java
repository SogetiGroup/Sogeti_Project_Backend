package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InvitationsController {

    ResponseEntity<InvitationsDto> create (InvitationsDto dto);
    ResponseEntity<InvitationsDto> findById(Integer invitationsId);
    ResponseEntity<List<InvitationsDto>> getAll();
    ResponseEntity<InvitationsDto> update(InvitationsDto dto);
    ResponseEntity<Void> delete (Integer invitationsId);


}
