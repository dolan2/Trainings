package com.docker.spring.infrastructure.repository;

import com.docker.spring.infrastructure.model.Quotation;
import org.springframework.data.repository.CrudRepository;

public interface QuotationRepository extends CrudRepository<Quotation, Long> {}
