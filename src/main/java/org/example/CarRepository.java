package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    List<Car> storage;

    public CarRepository() {
        storage = new ArrayList<>();
    }

    public void addCar(Car car){
        car.setId((long) storage.size());
        storage.add(car);
    }

    public List<Car> findByManufacturer(String manufacturer){
        return storage.
                stream().
                filter(car -> car.getManufacturer().equals(manufacturer)).
                collect(Collectors.toList());
    }

    public List<Car> findByHigherPriceThan(Integer price){
        return storage.
                stream().
                filter(car -> car.getPrice() > price).
                collect(Collectors.toList());
    }

    public List<Car> findByYearsUsageMoreThan(Integer years){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return storage.
                stream().
                filter(car -> car.getManufacturedYear() < currentYear-years).
                collect(Collectors.toList());
    }
}
