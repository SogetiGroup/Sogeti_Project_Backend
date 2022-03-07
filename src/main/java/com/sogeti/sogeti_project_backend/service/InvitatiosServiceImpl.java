package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.models.Invitations;
import com.sogeti.sogeti_project_backend.repository.InvitationsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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
    public InvitationsDto findById(Integer invitationsId) {
        Optional<Invitations> result = invitationsRepository.findById(invitationsId);
        return mapper.map(result,InvitationsDto.class);
    }


    @Override
    public List<InvitationsDto> findAll() {
       List<Invitations> list = new ArrayList<>();
       invitationsRepository.findAll().iterator().forEachRemaining(list::add);
       return list.stream().map(category -> mapper.map(category, InvitationsDto.class)).collect(Collectors.toList());
    }

    @Override
    public InvitationsDto update(InvitationsDto dto) {
        Invitations entity = mapper.map(dto, Invitations.class);
        Invitations result = invitationsRepository.save(entity);

        return mapper.map(result, InvitationsDto.class);
    }

    @Override
    public void delete(Integer invitationsId) {
        invitationsRepository.delete(mapper.map(findById(invitationsId), Invitations.class));

    }
}
