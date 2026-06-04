package com.example.invoice_service.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceRequest {
    @NotNull
    Long participantId;
    LocalDate issueDate;
    LocalDate dueDate;
    BigDecimal totalAmount;
}
