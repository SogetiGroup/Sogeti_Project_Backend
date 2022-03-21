package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;

import java.util.List;


public interface InvitationsService {

    InvitationsDto create (InvitationsDto dto) throws ArgumentException;
    InvitationsDto findById(Integer invitationsId) throws DataNotFoundException, ArgumentException;
    List<InvitationsDto> findAll();
    InvitationsDto update(InvitationsDto dto) throws ArgumentException;
    void delete (Integer invitationsId) throws DataNotFoundException;
}
