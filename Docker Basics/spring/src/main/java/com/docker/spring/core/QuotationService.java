package com.docker.spring.core;

import com.docker.spring.infrastructure.model.Quotation;
import com.docker.spring.infrastructure.repository.QuotationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationService {

    QuotationRepository quotationRepository;

    public QuotationService(QuotationRepository quotationRepository) {
        this.quotationRepository = quotationRepository;
    }

    public void saveQuotation(List<Quotation> quotations){
        quotationRepository.saveAll(quotations);
    }

    public List<Quotation> readAllQuotations(){
        return (List<Quotation>) quotationRepository.findAll();
    }
}
