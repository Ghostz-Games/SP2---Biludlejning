package SP2;

public class DieselCar extends AFuelCar{

    private int kmPrLitre;

    public DieselCar(int kmPrLitre){
        super(kmPrLitre);
        this.kmPrLitre = kmPrLitre;
    }


    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = super.getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050 + 1930;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 5500 + 2770;
        } else if (kmPrLitre < 5) {
            return 10470 + 15260;
        }else return 0;
    }

    public boolean hasParticleFilter(){
        return false;
    }

    @Override
    public String toString(){
        return super.toString()+" "+"Fuel type: "+getFuelType()+" "+"Registration Fee: "+getRegistrationFee();
    }

}
