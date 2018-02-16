package com.rentsbikes.services;

import com.rentsbikes.domain.RentDomain;

public interface RentService {

    void save(RentDomain rentDomain);
    RentDomain getById(Long id);
}
