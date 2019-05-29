package kz.kassayev.entity.autopark;

import kz.kassayev.entity.model.Car;

import java.util.ArrayList;

/**
 * Create garage for cars
 */
public class Garage {
    private String name;
    private ArrayList<Car> carsList = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    /**
     * method for add parameters
     * @param car
     */
    public void addCar(Car car) {
        carsList.add(car);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCarsList() {
        return carsList;
    }
}
