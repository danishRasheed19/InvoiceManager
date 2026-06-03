package com.example.particpant.utils;

import com.example.particpant.DTO.ParticipantResponse;
import com.example.particpant.model.Participant;

public class ParticipantDtoMapper {
    public static Participant toEntity(ParticipantResponse participantResponse) {
        return Participant.builder()
                .participantId(participantResponse.getParticipantId())
                .companyName(participantResponse.getCompanyName())
                .country(participantResponse.getCountry())
                .build();
    }
    public static ParticipantResponse toDTO(Participant participant) {
        return ParticipantResponse.builder()
                .participantId(participant.getParticipantId())
                .companyName(participant.getCompanyName())
                .country(participant.getCountry())
                .build();
    }
}
