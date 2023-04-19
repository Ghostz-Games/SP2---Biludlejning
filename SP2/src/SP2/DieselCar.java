package SP2;

public class DieselCar extends AFuelCar{

    private boolean particleFilter = false;
    private int kmPrLitre;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.kmPrLitre = kmPrLitre;
        this.particleFilter = particleFilter;
    }


    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = super.getKmPrLitre();
        int amount = 0;

        if(!hasParticleFilter()){
            amount += 1000;
        }else {
            amount += 0;
        }

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return amount + 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return amount + 1050 + 1930;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return amount + 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return amount + 5500 + 2770;
        } else if (kmPrLitre < 5) {
            return amount + 10470 + 15260;
        }else return 0;
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public String toString(){
        return super.toString()+", "+"Fuel type: "+getFuelType()+", "+"Has particle filter: "+hasParticleFilter()+", "+"Registration Fee: "+getRegistrationFee();
    }

}
