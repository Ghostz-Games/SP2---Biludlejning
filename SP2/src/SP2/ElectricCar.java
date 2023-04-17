package SP2;

public class ElectricCar extends ACar{

    int batteryCapacity;

    int maxRange;
    

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){
        return 0;
    }

    public int getRegistrationFee(){
        return 0;
    }

    @Override
    public String toString(){
        return "";
    }
}
