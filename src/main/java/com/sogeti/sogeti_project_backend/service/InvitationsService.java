package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;


public interface InvitationsService {

    InvitationsDto create (InvitationsDto dto);
    InvitationsDto findById(String invitationsId);
    InvitationsDto update(InvitationsDto dto);
    void delete (String invitationsId);
}
