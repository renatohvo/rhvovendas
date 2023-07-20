package com.renatohvo.rhvovendas.service;

import com.renatohvo.rhvovendas.dto.SaleDTO;
import com.renatohvo.rhvovendas.repository.SaleRepository;
import com.renatohvo.rhvovendas.repository.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        return repository.findAll(pageable).map(s -> modelMapper.map(s, SaleDTO.class));
    }

}
