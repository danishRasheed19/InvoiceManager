package com.example.particpant.service;

import com.example.particpant.DTO.ParticipantRequest;
import com.example.particpant.DTO.ParticipantResponse;
import com.example.particpant.model.Participant;
import com.example.particpant.repository.ParticipantRepository;
import com.example.particpant.utils.ParticipantDtoMapper;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }
    public Participant create(ParticipantRequest participantRequest) {
        Participant participant = new Participant();
        participant.setParticipantId(participantRequest.getParticipantId());
        participant.setCompanyName(participantRequest.getCompanyName());
        participant.setCountry(participantRequest.getCountry());
        return participantRepository.save(participant);
    }
    public ParticipantResponse findByParticipantId(String participantId) {
        return ParticipantDtoMapper.toDTO(participantRepository.findByParticipantId(participantId).orElse(null));
    }
}
