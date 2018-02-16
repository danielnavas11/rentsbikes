package com.rentsbikes.services;

import com.rentsbikes.domain.RentDomain;

import java.util.List;

public interface RentService {

    void save(RentDomain rentDomain);
    RentDomain getById(Long id);

    List<RentDomain> getAll();

    void delete(RentDomain bike);

}
