package com.example.invoice_service.controller;

import com.example.invoice_service.DTO.InvoiceRequest;
import com.example.invoice_service.DTO.InvoiceResponse;
import com.example.invoice_service.InvoiceService;
import com.example.invoice_service.model.Invoice;
import com.example.invoice_service.util.DtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @PostMapping
    public InvoiceResponse create(@RequestBody InvoiceRequest request){
        return DtoMapper.toDTO(invoiceService.createInvoice(request));
    }
    @GetMapping("/{id}")
    public InvoiceResponse getById(@PathVariable Long id){
        return DtoMapper.toDTO(invoiceService.getById(id));
    }
}
