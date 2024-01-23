package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Chevrolet", 50000, "Paparo"));
        carList.add(new Car("Lamborghini", 500000, "DIABLO"));
        carList.add(new Car("Mazda", 14000, "RX8"));
        carList.add(new Car("Priora", 40, "Cashback"));
        carList.add(new Car("Messi", 50000000, "Ronaldo"));
    }

    @Override
    public List<Car> getCars(int number) {
        return carList.stream().limit(number).toList();
    }
}
