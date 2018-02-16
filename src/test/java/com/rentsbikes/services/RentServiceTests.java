package com.rentsbikes.services;

import com.rentsbikes.AbstractGenericDataJpaTest;
import com.rentsbikes.domain.Bike;
import com.rentsbikes.domain.RentDomain;
import com.rentsbikes.mock.BikeMock;
import com.rentsbikes.mock.RentDomainMock;
import com.rentsbikes.services.impl.RentServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.List;

@DataJpaTest(includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
        RentServiceImpl.class
}))
public class RentServiceTests extends AbstractGenericDataJpaTest {

    @Autowired
    private RentService rentService;

    @Test
    public void saveRentBikePerHourByService(){
        RentDomain rentDomain = RentDomainMock.createBasicRentPerHour(BikeMock.createBasicBikeOne());
        rentService.save(rentDomain);
        Assert.assertTrue(rentService.getById(rentDomain.getId()).equals(rentDomain));
    }

    @Test
    public void deleteRentBikePerHourByService(){
        RentDomain rentDomain = RentDomainMock.createBasicRentPerHour(BikeMock.createBasicBikeOne());
        rentService.save(rentDomain);
        rentService.delete(rentDomain);
        Assert.assertTrue(rentService.getAll().size()==0);
    }

}
