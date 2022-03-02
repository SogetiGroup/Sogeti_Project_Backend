package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.models.Invitations;
import com.sogeti.sogeti_project_backend.repository.InvitationsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvitatiosServiceImpl implements InvitationsService {

    private final ModelMapper mapper;
    private final InvitationsRepository invitationsRepository;

    @Autowired
    public InvitatiosServiceImpl(ModelMapper mapper, InvitationsRepository invitationsRepository) {
        this.mapper = mapper;
        this.invitationsRepository = invitationsRepository;
    }


   @Override
    public InvitationsDto create(InvitationsDto dto) {
        Invitations saved = mapper.map(dto, Invitations.class);
        Invitations result = invitationsRepository.save(saved);
        return mapper.map(result, InvitationsDto.class);
    }

    @Override
    public InvitationsDto findById(String invitationsId) {
        return null;
    }

    @Override
    public InvitationsDto update(InvitationsDto dto) {
        return null;
    }

    @Override
    public void delete(String invitationsId) {
        invitationsRepository.delete(mapper.map(findById(invitationsId),Invitations.class));

    }
}
