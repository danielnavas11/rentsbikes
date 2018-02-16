package com.rentsbikes.services;

import com.rentsbikes.AbstractGenericDataJpaTest;
import com.rentsbikes.domain.Bike;
import com.rentsbikes.mock.BikeMock;
import com.rentsbikes.services.impl.BikeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.List;

@DataJpaTest(includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
        BikeServiceImpl.class
}))
public class BikeServiceTests extends AbstractGenericDataJpaTest{

    @Autowired
    private BikeService bikeService;

    @Test
    public void saveBikeByService(){
        Bike bike = BikeMock.createBasicBike();
        bikeService.save(bike);
        Assert.assertTrue(bikeService.getById(bike.getId()).equals(bike));
    }

    @Test
    public void saveBikesByService(){
        List<Bike> bikes = BikeMock.createBasicBikeOne();
        bikeService.save(bikes);
        Assert.assertTrue(bikeService.getById(bikes.get(0).getId()).equals(bikes.get(0)));
    }

    @Test
    public void saveBikesByServiceSize(){
        List<Bike> bikes = BikeMock.createBasicBikeOne();
        bikeService.save(bikes);
        Assert.assertTrue(bikeService.getAll().size()==1);
    }

    @Test
    public void saveBikesByServiceSizeFamily(){
        List<Bike> bikes = BikeMock.createBasicBikeFamily();
        bikeService.save(bikes);
        Assert.assertTrue(bikeService.getAll().size()==5);
    }
}
