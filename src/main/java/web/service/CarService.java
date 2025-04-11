package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();

        cars.add(new Car("black", "BMW", 2020));
        cars.add(new Car("red", "Honda", 2000));
        cars.add(new Car("yellow", "Toyota", 1999));
        cars.add(new Car("green", "Mers", 2002));
        cars.add(new Car("blue", "Lada", 2014));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}