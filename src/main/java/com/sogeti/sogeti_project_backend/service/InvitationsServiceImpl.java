package com.sogeti.sogeti_project_backend.service;

import com.sogeti.sogeti_project_backend.Exception.ArgumentException;
import com.sogeti.sogeti_project_backend.Exception.DataNotFoundException;
import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.models.Invitations;
import com.sogeti.sogeti_project_backend.repository.InvitationsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class InvitationsServiceImpl implements InvitationsService {

    private final ModelMapper mapper;
    private final InvitationsRepository invitationsRepository;


    public InvitationsServiceImpl(ModelMapper mapper, InvitationsRepository invitationsRepository) {
        this.mapper = mapper;
        this.invitationsRepository = invitationsRepository;
    }


    @Override
    @Transactional
    public InvitationsDto create(InvitationsDto dto) throws ArgumentException {
        if (dto == null) throw new ArgumentException("Person data should not be null");
        if (dto.getInvitationId() != 0) throw new ArgumentException("id should be null");
        Invitations saved = mapper.map(dto, Invitations.class);
        Invitations result = invitationsRepository.save(saved);
        return mapper.map(result, InvitationsDto.class);
    }

    @Override
    public InvitationsDto findById(Integer invitationsId) throws DataNotFoundException, ArgumentException {
        //Optional<Invitations> result = invitationsRepository.findById(invitationsId);
        //return mapper.map(result,InvitationsDto.class);

        if (invitationsId == null || invitationsId == 0) throw new ArgumentException("Invitations Id should not be null or 0");
        Invitations result = invitationsRepository.findById(invitationsId).orElseThrow(() -> new DataNotFoundException("Invitations not found"));
        return mapper.map(result, InvitationsDto.class);
    }


    @Override
    public List<InvitationsDto> findAll() {
       List<Invitations> list = new ArrayList<>();
       invitationsRepository.findAll().iterator().forEachRemaining(list::add);
       return list.stream().map(category -> mapper.map(category, InvitationsDto.class)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public InvitationsDto update(InvitationsDto dto) throws ArgumentException {

        if (dto == null) throw new ArgumentException("Invitations data should not be null");
        if (dto.getInvitationId() == 0) throw new ArgumentException("InvitationsId should not be null");

        Invitations entity = mapper.map(dto, Invitations.class);
        Invitations result = invitationsRepository.save(entity);
        return mapper.map(result, InvitationsDto.class);

    }

    @Override
    public void delete(Integer invitationsId)  throws DataNotFoundException {
        //invitationsRepository.delete(mapper.map(findById(invitationsId), Invitations.class));
        invitationsRepository.deleteById(invitationsId);
        invitationsRepository.existsById(invitationsId);

    }
}
