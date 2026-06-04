package com.example.invoice_service.model;

import com.example.invoice_service.enums.InvoiceStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long participantId;

    private LocalDate issueDate;

    private LocalDate dueDate;

    private BigDecimal totalAmount;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private InvoiceStatus status=InvoiceStatus.DRAFT;
}
