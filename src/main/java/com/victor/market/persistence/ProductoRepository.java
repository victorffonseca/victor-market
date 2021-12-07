package com.victor.market.persistence;

import com.victor.market.persistence.crud.ProductoCrudRepository;
import com.victor.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
