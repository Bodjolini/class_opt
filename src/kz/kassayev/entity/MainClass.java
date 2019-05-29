package kz.kassayev.entity;

import kz.kassayev.entity.autopark.Garage;
import kz.kassayev.entity.logic.Handler;
import kz.kassayev.entity.model.Car;
import kz.kassayev.entity.report.CarReport;

import java.util.ArrayList;

/**
 * 8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 */
public class MainClass {
    public static void main(String[] args) {
        Garage garage = new Garage("Chistyi Vikup");
        Handler handler = new Handler();
        CarReport carReport = new CarReport();

        garage.addCar(new Car("BMW", "M5", 2018, "White", 120_000, "KZ001SER01"));
        garage.addCar(new Car("Mercedes-Benz", "E63 AMG", 2014, "Grey", 60_000, "KZ002SER01"));
        garage.addCar(new Car("Mercedes-Benz", "G63 AMG", 2013, "White", 80_000, "KZ004SER04"));
        garage.addCar(new Car("Toyota", "Camry", 2009, "Black", 15_000, "KZ040SER04"));
        garage.addCar(new Car("Lexus", "LX 570", 2014, "Black", 50_000, "KZ007SER07"));
        garage.addCar(new Car("Toyota", "Camry", 2014, "White", 20_000, "KZ005SER01"));

        System.out.println("Car mark you chose : ");
        ArrayList<Car> carMark = handler.getSpeceficMark(garage.getCarsList(),"BMW");
        carReport.cycleForSout(carMark);

        System.out.println("Cars which older then n year : ");
        ArrayList<Car> carYear = handler.getOldCars(garage.getCarsList(),"Camry", 3);
        carReport.cycleForSout(carYear);

        System.out.println("List of cars of a given year, the price of which is higher than the specified. : ");
        ArrayList<Car> carPrice = handler.getCarsForYourPrice(garage.getCarsList(),2014, 40_000);
        carReport.cycleForSout(carPrice);
    }
}
