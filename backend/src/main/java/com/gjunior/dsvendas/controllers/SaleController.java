package com.gjunior.dsvendas.controllers;

import com.gjunior.dsvendas.dto.SaleDTO;
import com.gjunior.dsvendas.dto.SaleSuccessDTO;
import com.gjunior.dsvendas.dto.SaleSumDTO;
import com.gjunior.dsvendas.services.SaleService;
import com.gjunior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {

        Page<SaleDTO> list = service.findAll(pageable);

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sum-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {

        List<SaleSumDTO> list = service.amountGroupedBySeller();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sales-success")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {

        List<SaleSuccessDTO> list = service.successGroupedBySeller();

        return ResponseEntity.ok(list);
    }
}
