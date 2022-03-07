package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;

import java.util.List;


public interface InvitationsService {

    InvitationsDto create (InvitationsDto dto);
    InvitationsDto findById(Integer invitationsId);
    List<InvitationsDto> findAll();
    InvitationsDto update(InvitationsDto dto);
    void delete (Integer invitationsId);
}
