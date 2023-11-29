package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carsList;
    {
        carsList = new ArrayList<>();

        carsList.add(new Car("model1", 1, "white"));
        carsList.add(new Car("model2", 2, "black"));
        carsList.add(new Car("model3", 3, "yellow"));
        carsList.add(new Car("model4", 4, "orange"));
        carsList.add(new Car("model5", 5, "lime"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
