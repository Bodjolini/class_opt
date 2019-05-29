package kz.kassayev.entity.logic;

import kz.kassayev.entity.model.Car;

import java.util.ArrayList;

public class Handler {
    private static final int NOW = 2019;

    /**
     * method for finding the brand of car
     * @param carsList
     * @param mark
     * @return get list chose mark
     */
    public ArrayList<Car> getSpeceficMark(ArrayList<Car> carsList,String mark) {
        ArrayList<Car> carlist = new ArrayList<>();
        for (Car car : carsList) {
            if (car.getMark().equals(mark)) {
                carlist.add(car);
            }
        }
        return carlist;
    }

    /**
     * list of cars of a given model that have been operated for more than n years
     * @param carsList
     * @param model
     * @param n
     * @return get list
     */
    public ArrayList<Car> getOldCars(ArrayList<Car> carsList, String model, int n) {
        ArrayList<Car> carlist = new ArrayList<>();
        for (Car car : carsList) {
            if (car.getModel().equals(model)) {
                int year = NOW - car.getYear();
                if (year > n) {
                    carlist.add(car);
                }
            }
        }
        return carlist;
    }

    /**
     * list of cars of a given year, the price of which is higher than the specified.
     * @param carsList
     * @param year
     * @param yourPrice
     * @return get list
     */
    public ArrayList<Car> getCarsForYourPrice(ArrayList<Car> carsList, int year, int yourPrice) {
        ArrayList<Car> carlist = new ArrayList<>();
        for (Car car : carsList) {
            if (car.getYear() == year) {
                if (car.getPrice() > yourPrice) {
                    carlist.add(car);
                }
            }
        }
        return carlist;
    }
}
