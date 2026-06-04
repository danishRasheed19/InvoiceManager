package com.example.invoice_service;

import com.example.invoice_service.DTO.InvoiceRequest;
import com.example.invoice_service.model.Invoice;
import com.example.invoice_service.repository.InvoiceRepository;
import com.example.invoice_service.util.DtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    public Invoice createInvoice(InvoiceRequest invoiceRequest) {
        return invoiceRepository.save(DtoMapper.toEntity(invoiceRequest));
    }
    public Invoice getById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }

}
