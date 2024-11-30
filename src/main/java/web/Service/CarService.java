package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> returnCars(int count);

}
