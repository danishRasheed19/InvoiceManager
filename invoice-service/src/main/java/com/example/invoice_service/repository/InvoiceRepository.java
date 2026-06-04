package com.example.invoice_service.repository;

import com.example.invoice_service.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
