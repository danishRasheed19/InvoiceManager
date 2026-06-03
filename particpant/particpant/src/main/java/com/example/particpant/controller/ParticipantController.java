package com.example.particpant.controller;

import com.example.particpant.DTO.ParticipantRequest;
import com.example.particpant.DTO.ParticipantResponse;
import com.example.particpant.model.Participant;
import com.example.particpant.service.ParticipantService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/participants")
public class ParticipantController {
    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @PostMapping
    public Participant create(@RequestBody ParticipantRequest participantRequest) {
        return participantService.create(participantRequest);
    }
    @GetMapping("/{participantId}")
    public ParticipantResponse getParticipantById(@PathVariable String participantId){
        return participantService.findByParticipantId(participantId);
    }
}
