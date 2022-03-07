package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.service.InvitationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/event/api/v1/invitations")
public class InvitationsController {



    private final InvitationsService invitationsService;

    @Autowired
    public InvitationsController(InvitationsService invitationsService) {
        this.invitationsService = invitationsService;
    }


    @PostMapping
    public ResponseEntity<InvitationsDto> create(@RequestBody InvitationsDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(invitationsService.create(dto));
    }

    @GetMapping
    public ResponseEntity<InvitationsDto> findById(Integer id){
        return ResponseEntity.ok(invitationsService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<InvitationsDto>> getAll() {
        return ResponseEntity.ok(invitationsService.findAll());
    }

    @PutMapping
    public ResponseEntity<InvitationsDto> update(InvitationsDto dto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(invitationsService.update(dto));
    }

    public ResponseEntity<Void> delete(Integer id) {
        invitationsService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
