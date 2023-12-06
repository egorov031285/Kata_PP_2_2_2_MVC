package web.servis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("reno sandero", "black", 287));
        cars.add(new Car("volvo cx7", "pink", 431));
        cars.add(new Car("kia rio", "black", 156));
        cars.add(new Car("kia cerato", "green", 506));
        cars.add(new Car("wv golf", "rad", 265));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
