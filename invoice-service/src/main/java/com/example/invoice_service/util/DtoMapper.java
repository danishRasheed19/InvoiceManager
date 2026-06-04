package com.example.invoice_service.util;

import com.example.invoice_service.DTO.InvoiceRequest;
import com.example.invoice_service.DTO.InvoiceResponse;
import com.example.invoice_service.model.Invoice;

public class DtoMapper {
    public static Invoice toEntity(InvoiceRequest invoiceRequest){
        return Invoice.builder()
                .participantId(invoiceRequest.getParticipantId())
                .issueDate(invoiceRequest.getIssueDate())
                .dueDate(invoiceRequest.getDueDate())
                .totalAmount(invoiceRequest.getTotalAmount())
                .build();
    }
    public static InvoiceResponse toDTO(Invoice invoice){
        return InvoiceResponse.builder()
                .participantId(invoice.getParticipantId())
                .issueDate(invoice.getIssueDate())
                .dueDate(invoice.getDueDate())
                .totalAmount(invoice.getTotalAmount())
                .status(invoice.getStatus())
                .build();
    }
}
