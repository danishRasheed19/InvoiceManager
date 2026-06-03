package com.example.particpant.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParticipantRequest {

    @NotBlank
    private String participantId;

    @NotBlank
    private String companyName;

    @NotBlank
    private String country;
}