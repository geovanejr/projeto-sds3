package com.gjunior.dsvendas.services;

import com.gjunior.dsvendas.dto.SellerDTO;
import com.gjunior.dsvendas.entities.Seller;
import com.gjunior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {

        List<Seller> result = repository.findAll();

        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
