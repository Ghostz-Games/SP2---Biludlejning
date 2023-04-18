package SP2;

import java.util.ArrayList;

public class FleetOfCars {

    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
        int amount = 0;
        for(Car c: fleet){
            amount += c.getRegistrationFee();
        }
        return amount;
    }

    @Override
    public String toString(){
        String out = "";
        for(Car c: fleet){
           out += "\n"+c.toString();
        }
        return out;
    }
}
