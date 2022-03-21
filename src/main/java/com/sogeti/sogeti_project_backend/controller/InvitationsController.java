package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InvitationsController {

    ResponseEntity<InvitationsDto> create (InvitationsDto dto) throws ArgumentException;
    ResponseEntity<InvitationsDto> findById(Integer invitationsId) throws DataNotFoundException, ArgumentException;
    ResponseEntity<List<InvitationsDto>> findAll();
    ResponseEntity<InvitationsDto> update(InvitationsDto dto) throws ArgumentException;
    ResponseEntity<Void> delete (Integer invitationsId) throws DataNotFoundException;


}
