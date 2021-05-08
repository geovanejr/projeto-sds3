package com.gjunior.dsvendas.dto;

import com.gjunior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {

    private long id;
    private String name;
    private static final long serialVersionUID = 1L;

    public SellerDTO() {
    }

    public SellerDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
