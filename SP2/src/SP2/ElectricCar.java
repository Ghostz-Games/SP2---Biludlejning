package SP2;

public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange){
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
            return 330 + 130;
        } else if (kmPL >= 15 && kmPL <= 20) {
            return 1050 + 1930;
        } else if (kmPL >= 10 && kmPL <= 15) {
            return 2340 + 1850;
        } else if (kmPL >= 5 && kmPL <= 10) {
            return 5500 + 2770;
        } else if (kmPL < 5) {
            return 10470 + 15260;
        }else return 0;
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Watt hour per Kilometer: "+getWhPrKm()+" "+"Battery capacity:"+getBatteryCapacityKWh()+" "+"Max range:"+getMaxRangeKm()+" "+"Registration fee:"+getRegistrationFee();
    }
}
