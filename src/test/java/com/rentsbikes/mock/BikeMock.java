package com.rentsbikes.mock;

import com.rentsbikes.domain.Bike;

import java.util.ArrayList;
import java.util.List;

public final class BikeMock {
    public static Bike createBasicBike(){
        Bike bike = new Bike();
        bike.setId(1l);
        return bike;
    }
    public static Bike createBasicBike(int i){
        Bike bike = new Bike();
        bike.setId(new Long(i));
        return bike;
    }

    public static List<Bike> createBasicBikeOne(){
        List list = new ArrayList();
        list.add(createBasicBike());
        return list;
    }

    public static List<Bike> createBasicBikeLot(){
        List list = new ArrayList();
        for (int i=0;i<100;i++)
            list.add(createBasicBike(i));
        return list;
    }

    public static List<Bike> createBasicBikeFamily(){
        List list = new ArrayList();
        for (int i=0;i<5;i++) {
            list.add(createBasicBike(i));
        }
        return list;
    }
}
