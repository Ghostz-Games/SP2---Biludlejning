package SP2;

public class Main {

    public static void main(String[] args) {


        FleetOfCars fleet = new FleetOfCars();
        DieselCar car1 = new DieselCar("DK:MD23233","Volkswagen","Polo",4,22);
        ElectricCar car2 = new ElectricCar("DK:VR00MM1", "Tesla", "model 3", 4, 57, 75);
        GasolineCar car3 = new GasolineCar("DK:KACH00W", "Volvo", "XC60",4,12);
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println(fleet.toString());
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("The total registraion fee for the fleet is: "+fleet.getTotalRegistrationFeeForFleet()+" DKK");
        System.out.println("------------------------------------------------------------------------------------------------------------");

    }
}
