package kz.kassayev.entity.Service;

import kz.kassayev.entity.pojo.Car;

import java.util.ArrayList;

public class CarService {

    private static final int NOW = 2019;
    private String name;
    private ArrayList<Car> carsList = new ArrayList<>();

    public CarService(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        carsList.add(car);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getSpeceficMark(String mark) {
        ArrayList<Car> crlist = new ArrayList<>();
        for (Car cr : carsList) {
            if (cr.getMark().equals(mark)) {
                crlist.add(cr);
            }
        }
        return crlist;
    }

    public ArrayList<Car> getOldCars(String model, int n) {
        ArrayList<Car> crlist = new ArrayList<>();
        for (Car cr : carsList) {
            if (cr.getModel().equals(model)) {
                int year = NOW - cr.getYear();
                if (year > n) {
                    crlist.add(cr);
                }
            }
        }
        return crlist;
    }

    public ArrayList<Car> getCarsForYourPrice(int year, int yourPrice) {
        ArrayList<Car> crlist = new ArrayList<>();
        for (Car cr : carsList) {
            if (cr.getYear() == year) {
                if (cr.getPrice() > yourPrice) {
                    crlist.add(cr);
                }
            }
        }
        return crlist;
    }
}
