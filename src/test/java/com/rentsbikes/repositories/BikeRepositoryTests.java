package com.rentsbikes.repositories;

import com.rentsbikes.AbstractGenericDataJpaTest;
import com.rentsbikes.domain.Bike;
import com.rentsbikes.mock.BikeMock;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


public class BikeRepositoryTests extends AbstractGenericDataJpaTest{

    @Autowired
    private BikeRepository repository;

    @Test
    public void saveBikeByRepository(){
        repository.save(BikeMock.createBasicBikeOne());
        Assert.assertTrue(repository.count() == 1);
    }
}
