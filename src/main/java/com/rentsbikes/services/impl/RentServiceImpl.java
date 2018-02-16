package com.rentsbikes.services.impl;

import com.rentsbikes.domain.RentDomain;
import com.rentsbikes.repositories.RentDomainRepository;
import com.rentsbikes.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
