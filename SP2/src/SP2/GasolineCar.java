package SP2;

public class GasolineCar extends AFuelCar {

    private int kmPrLitre;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = super.getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 5500;
        } else if (kmPrLitre < 5) {
            return 10470;
        }else return 0;
    }

    @Override
    public String toString(){
        return super.toString()+", "+"Fuel type: "+getFuelType()+", "+"Registration Fee: "+getRegistrationFee();
    }
}
