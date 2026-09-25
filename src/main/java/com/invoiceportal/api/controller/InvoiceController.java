package com.invoiceportal.api.controller;

import com.invoiceportal.api.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    // TODO: Temporary endpoint used to verify JwtAuthenticationFilter works end-to-end.
    // Replace with real invoice endpoints (list, create, get by id, etc.) once InvoiceService is implemented.
    @GetMapping
    public String test() {
        return "You are authenticated! JWT filter works.";
    }
}