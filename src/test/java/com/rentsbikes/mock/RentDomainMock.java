package com.rentsbikes.mock;

import com.rentsbikes.domain.Bike;
import com.rentsbikes.domain.RentDomain;
import com.rentsbikes.enums.TypeRent;

import java.math.BigDecimal;
import java.util.List;

public final class RentDomainMock {

    private static BigDecimal getDiscountPrice(RentDomain rentDomain){
        return rentDomain.getPrice().multiply(new BigDecimal(0.3));
    }

    private static BigDecimal getTotalPriceRent(RentDomain rentDomain){
        BigDecimal totalPrice = rentDomain.isPromotion()? rentDomain.getPrice().subtract(getDiscountPrice(rentDomain)): rentDomain.getPrice();
        return totalPrice;
    }

    private static RentDomain createBasicRent(){
        RentDomain rentDomain = new RentDomain();
        rentDomain.setId(1l);
        rentDomain.setPrice(new BigDecimal(100));
        return rentDomain;
    }

    public static RentDomain createBasicRentPerDay(List<Bike> bikes){
        RentDomain rentDomain = createBasicRent();
        rentDomain.setBikes(bikes);
        rentDomain.setTypeRent(TypeRent.perDay);
        rentDomain.setPromotion(TypeRent.perFamily.equals(rentDomain.getTypeRent()));
        rentDomain.setTotalPrice(getTotalPriceRent(rentDomain));
        return rentDomain;
    }

    public static RentDomain createBasicRentPerHour(List<Bike> bikes){
        RentDomain rentDomain = createBasicRent();
        rentDomain.setBikes(bikes);
        rentDomain.setTypeRent(TypeRent.perHour);
        rentDomain.setPromotion(TypeRent.perFamily.equals(rentDomain.getTypeRent()));
        rentDomain.setTotalPrice(getTotalPriceRent(rentDomain));
        return rentDomain;
    }

    public static RentDomain createBasicRentPerWeek(List<Bike> bikes){
        RentDomain rentDomain = createBasicRent();
        rentDomain.setBikes(bikes);
        rentDomain.setTypeRent(TypeRent.perWeek);
        rentDomain.setPromotion(TypeRent.perFamily.equals(rentDomain.getTypeRent()));
        rentDomain.setTotalPrice(getTotalPriceRent(rentDomain));
        return rentDomain;
    }

    public static RentDomain createBasicRentPerFamily(List<Bike> bikes){
        RentDomain rentDomain = createBasicRent();
        rentDomain.setBikes(bikes);
        rentDomain.setTypeRent(TypeRent.perFamily);
        rentDomain.setPromotion(TypeRent.perFamily.equals(rentDomain.getTypeRent()));
        rentDomain.setTotalPrice(getTotalPriceRent(rentDomain));
        System.out.println(rentDomain.getTotalPrice());
        return rentDomain;
    }
}
