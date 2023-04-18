package SP2;

public abstract class AFuelCar extends ACar {

    private int kmPrLitre;


    public AFuelCar(int kmPrLitre){

        kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    int getKmPrLitre(){
        return this.kmPrLitre;
    }

}
