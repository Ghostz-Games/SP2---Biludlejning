package SP2;

import java.io.FilterOutputStream;

public class Main {

    public static void main(String[] args) {


        FleetOfCars fleet = new FleetOfCars();
        DieselCar car1 = new DieselCar("DK:MD23233","Volkswagen","Polo",4,22, true);
        DieselCar car2 = new DieselCar("DK:TK43W33","Volkswagen","Polo",4,22, false);
        ElectricCar car3 = new ElectricCar("DK:VR00MM1", "Tesla", "model 3", 4, 57, 75);
        GasolineCar car4 = new GasolineCar("DK:KACH00W", "Volvo", "XC60",4,12);
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println(fleet.toString());
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("The total registraion fee for the fleet is: "+fleet.getTotalRegistrationFeeForFleet()+" DKK");
        System.out.println("------------------------------------------------------------------------------------------------------------");


    }
}
