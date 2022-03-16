package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.service.InvitationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/invitations")
public class InvitationsControllerImpl implements InvitationsController {



    private final InvitationsService invitationsService;


    public InvitationsControllerImpl(InvitationsService invitationsService) {
        this.invitationsService = invitationsService;
    }


    @Override
    @PostMapping
    public ResponseEntity<InvitationsDto> create(@RequestBody InvitationsDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(invitationsService.create(dto));
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<InvitationsDto> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(invitationsService.findById(id));
    }


    @Override
    @GetMapping
    public ResponseEntity<List<InvitationsDto>> getAll() {
        return ResponseEntity.ok(invitationsService.findAll());
    }

    @Override
    @PutMapping
    public ResponseEntity<InvitationsDto> update(InvitationsDto dto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(invitationsService.update(dto));
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        invitationsService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
