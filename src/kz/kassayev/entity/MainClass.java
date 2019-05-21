package kz.kassayev.entity;

import kz.kassayev.entity.Service.CarService;
import kz.kassayev.entity.pojo.Car;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        CarService carService = new CarService("Chistyi Vikup");

        carService.addCar(new Car("BMW", "M5", 2018, "White", 120_000, "KZ001SER01"));
        carService.addCar(new Car("Mercedes-Benz", "E63 AMG", 2014, "Grey", 60_000, "KZ002SER01"));
        carService.addCar(new Car("Mercedes-Benz", "G63 AMG", 2013, "White", 80_000, "KZ004SER04"));
        carService.addCar(new Car("Toyota", "Camry", 2009, "Black", 15_000, "KZ040SER04"));
        carService.addCar(new Car("Lexus", "LX 570", 2014, "Black", 50_000, "KZ007SER07"));
        carService.addCar(new Car("Toyota", "Camry", 2014, "White", 20_000, "KZ005SER01"));

        System.out.println("Car mark you chose : ");
        ArrayList<Car> carMark = carService.getSpeceficMark("BMW");
        for (Car car : carMark) {
            System.out.println(car);
        }

        System.out.println("Cars which older then n year : ");
        ArrayList<Car> carYear = carService.getOldCars("Camry", 3);
        for (Car car : carYear) {
            System.out.println(car);
        }

        System.out.println("Cars for you need year and your money : ");
        ArrayList<Car> carPrice = carService.getCarsForYourPrice(2014, 40_000);
        for (Car car : carPrice) {
            System.out.println(car);
        }
    }
}
