package web.Dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars;
    public CarDaoImp() {
        cars = new ArrayList<Car>();
        cars.add(new Car("ZIL","130",1980));
        cars.add(new Car("Teslo","Bogdan",1988));
        cars.add(new Car("Light","Meslo",2090));
        cars.add(new Car("Honda","Ponda",2010));
        cars.add(new Car("Chevy","Irgish",2012));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> returnCar(int quantity) {
        return cars.subList(0, Math.min(quantity, cars.size()));
    }
}
