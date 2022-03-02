package com.sogeti.sogeti_project_backend.controller;

import com.sogeti.sogeti_project_backend.dto.InvitationsDto;
import com.sogeti.sogeti_project_backend.service.InvitationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/event/api/vi/invitations")
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





}
