package kz.kassayev.entity.report;

import kz.kassayev.entity.model.Car;

import java.util.ArrayList;

public class CarReport {
    public void cycleForSout(ArrayList<Car> cars){
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
