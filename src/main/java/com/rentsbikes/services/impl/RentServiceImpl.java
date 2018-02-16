package com.rentsbikes.services.impl;

import com.rentsbikes.domain.RentDomain;
import com.rentsbikes.repositories.RentDomainRepository;
import com.rentsbikes.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService{
    @Autowired
    private RentDomainRepository rentDomainRepository;

    @Override
    public void save(RentDomain rentDomain) {
        rentDomainRepository.save(rentDomain);
    }

    @Override
    public RentDomain getById(Long id) {
        return rentDomainRepository.getOne(id);
    }

    @Override
    public List<RentDomain> getAll() {
        return rentDomainRepository.findAll();
    }

    @Override
    public void delete(RentDomain bike) {
        rentDomainRepository.delete(bike);
    }

}
