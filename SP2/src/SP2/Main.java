package SP2;

public class Main {

    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();
        DieselCar car1 = new DieselCar(20);
        ElectricCar car2 = new ElectricCar(1600, 80);
        GasolineCar car3 = new GasolineCar(20);
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());
        System.out.println(fleet.toString());


    }
}
