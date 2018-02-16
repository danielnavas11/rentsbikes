package com.rentsbikes.services;

import com.rentsbikes.domain.Bike;

import java.util.List;

public interface BikeService {
    void save(Bike bike);

    void save(List<Bike> bikes);

    Bike getById(Long id);

    List<Bike> getAll();
    void delete(Bike bike);
    void delete(List<Bike> bikes);

}
