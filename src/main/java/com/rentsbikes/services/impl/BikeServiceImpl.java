package com.rentsbikes.services.impl;

import com.rentsbikes.domain.Bike;
import com.rentsbikes.repositories.BikeRepository;
import com.rentsbikes.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public void save(Bike bike) {
        bikeRepository.save(bike);
    }

    @Override
    public void save(List<Bike> bikes) {
        bikeRepository.save(bikes);
    }

    @Override
    public Bike getById(Long id) {
        return bikeRepository.getOne(id);
    }

    @Override
    public List<Bike> getAll() {
        return bikeRepository.findAll();
    }


    @Override
    public void delete(Bike bike) {
        bikeRepository.delete(bike);
    }

    @Override
    public void delete(List<Bike> bikes) {
        bikeRepository.delete(bikes);
    }

}
