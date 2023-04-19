package SP2;

public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh(){
        return this.batteryCapacity;
    }

    public int getMaxRangeKm(){
        return this.maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity * 1000 / maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPL = (int) (100 / (getWhPrKm() / 91.25));
        if (kmPL >= 20 && kmPL <= 50) {
            return 330;
        } else if (kmPL >= 15 && kmPL <= 20) {
            return 1050;
        } else if (kmPL >= 10 && kmPL <= 15) {
            return 2340;
        } else if (kmPL >= 5 && kmPL <= 10) {
            return 5500;
        } else if (kmPL < 5) {
            return 10470;
        }else return 0;
    }

    @Override
    public String toString(){
        return super.toString()+", "+"Watt hour per Kilometer: "+getWhPrKm()+", "+"Battery capacity: "+getBatteryCapacityKWh()+", "+"Max range: "+getMaxRangeKm()+", "+"Registration fee: "+getRegistrationFee();
    }
}
