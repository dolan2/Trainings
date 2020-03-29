package com.docker.spring.presentation;

import com.docker.spring.core.QuotationService;
import com.docker.spring.infrastructure.model.Quotation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class QuotationController {

    QuotationService quotationService;

    public QuotationController(QuotationService quotationService) {
        this.quotationService = quotationService;
    }

    @GetMapping("/quotations")
    public List<Quotation> getQuotations(){
        return quotationService.readAllQuotations();
    }

}


