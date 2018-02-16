package com.rentsbikes.repositories;

import com.rentsbikes.AbstractGenericDataJpaTest;
import com.rentsbikes.domain.RentDomain;
import com.rentsbikes.mock.BikeMock;
import com.rentsbikes.mock.RentDomainMock;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RentDomainRepositoryTests  extends AbstractGenericDataJpaTest {

    @Autowired
    private RentDomainRepository rentDomainRepository;

    @Test
    public void saveRentDomainPerDayByRepository(){
        rentDomainRepository.save(RentDomainMock.createBasicRentPerDay(BikeMock.createBasicBikeOne()));
        Assert.assertTrue(rentDomainRepository.count() == 1);
    }

    @Test
    public void saveRentDomainPerDayBikesByRepository(){
        RentDomain basicRentPerDay = RentDomainMock.createBasicRentPerDay(BikeMock.createBasicBikeOne());
        rentDomainRepository.save(basicRentPerDay);
        Assert.assertTrue(basicRentPerDay.getBikes().size() == 1);
    }

    @Test
    public void saveRentDomainPerFamilyByRepository(){
        rentDomainRepository.save(RentDomainMock.createBasicRentPerFamily(BikeMock.createBasicBikeFamily()));
        Assert.assertTrue(rentDomainRepository.count() == 1);
    }

    @Test
    public void saveRentDomainPerFamilyBikesByRepository(){
        RentDomain basicRentPerFamily = RentDomainMock.createBasicRentPerFamily(BikeMock.createBasicBikeFamily());
        rentDomainRepository.save(basicRentPerFamily);
        Assert.assertTrue(basicRentPerFamily.getBikes().size() == 5);
    }

    @Test
    public void saveRentDomainPerHourByRepository(){
        rentDomainRepository.save(RentDomainMock.createBasicRentPerHour(BikeMock.createBasicBikeLot()));
        Assert.assertTrue(rentDomainRepository.count() == 1);
    }

    @Test
    public void saveRentDomainPerHourBikesByRepository(){
        RentDomain basicRentPerHour = RentDomainMock.createBasicRentPerHour(BikeMock.createBasicBikeLot());
        rentDomainRepository.save(basicRentPerHour);
        Assert.assertTrue(basicRentPerHour.getBikes().size() == 100);
    }

    @Test
    public void saveRentDomainPerWeekByRepository(){
        rentDomainRepository.save(RentDomainMock.createBasicRentPerWeek(BikeMock.createBasicBikeLot()));
        Assert.assertTrue(rentDomainRepository.count() == 1);
    }

    @Test
    public void saveRentDomainPerWeekBikesByRepository(){
        RentDomain basicRentPerWeek = RentDomainMock.createBasicRentPerWeek(BikeMock.createBasicBikeLot());
        rentDomainRepository.save(basicRentPerWeek);
        Assert.assertTrue(basicRentPerWeek.getBikes().size() == 100);
    }
}
