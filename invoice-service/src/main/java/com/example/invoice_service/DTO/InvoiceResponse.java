package com.example.invoice_service.DTO;

import com.example.invoice_service.enums.InvoiceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceResponse {
    Long participantId;
    LocalDate issueDate;
    LocalDate dueDate;
    BigDecimal totalAmount;
    InvoiceStatus status;
}
