package SP2;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    @Override
    public String toString(){
        return "";
    }

}
