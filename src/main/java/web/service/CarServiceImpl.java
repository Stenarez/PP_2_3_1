package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> auto;

    {
        auto = new ArrayList<>();

        auto.add(new Car("Audi", "q3", 1));
        auto.add(new Car("BVW", "5ser", 2));
        auto.add(new Car("Mers", "glk", 3));
        auto.add(new Car("MAZ", "5t", 4));
        auto.add(new Car("KOT", "kus", 5));
    }


    public List<Car> getCars(int count) {
        if (count == 0 | count > 5) {
            return auto;
        } else {
            return auto.stream().limit(count).collect(Collectors.toList());
        }

    }
}
