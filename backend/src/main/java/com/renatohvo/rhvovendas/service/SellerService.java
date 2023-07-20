package com.renatohvo.rhvovendas.service;

import com.renatohvo.rhvovendas.dto.SellerDTO;
import com.renatohvo.rhvovendas.repository.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public List<SellerDTO> findAll() {
        return repository.findAll().stream().map(s -> modelMapper.map(s, SellerDTO.class)).collect(Collectors.toList());
    }

}
