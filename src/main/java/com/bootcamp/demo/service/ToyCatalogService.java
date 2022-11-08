package com.bootcamp.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.bootcamp.demo.entity.ToyEntity;
import com.bootcamp.demo.exception.DataAccessException;
import com.bootcamp.demo.exception.ServiceException;
import com.bootcamp.demo.repository.ToyRepository;

public class ToyCatalogService {
    private ToyRepository toyRepository;

    public ToyCatalogService(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }

    public List<ToyEntity> getToyCatalog() {
        try {
            return toyRepository.findAll();
        } catch (DataAccessException e) {
            throw ServiceException.instance(e.getMessage());
        }

    }

    public List<ToyEntity> getToyCatalog(BigDecimal minimumPrice, BigDecimal maximumPrice) {
        try {
            return toyRepository.findByPrice(minimumPrice, maximumPrice);
        } catch (DataAccessException e) {
            throw ServiceException.instance(e.getMessage());
        }

    }
}
