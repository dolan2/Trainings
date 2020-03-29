package com.docker.spring.configuration;

import com.docker.spring.core.QuotationService;
import com.docker.spring.infrastructure.model.Quotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InitDatabase {

    QuotationService quotationService;

    public InitDatabase(QuotationService quotationService) {
        this.quotationService = quotationService;
    }

    @Bean
    public void init() {
        quotationService.saveQuotation(List.of(
                new Quotation(1L, "Volenti non fit iniuria"),
                new Quotation(2L, "Dura lex, sed lex"),
                new Quotation(3L, "Pecunia non olet")
        ));
    }

}
