package SP2;

public abstract class ACar implements Car {

    String registrationNumber = "";

    String make = "";

    String model = "";

    int numberOfDoors;

    public ACar(String reg, String make, String model, int nr){
        this.registrationNumber = reg;
        this.make = make;
        this.model = model;
        this.numberOfDoors = nr;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString(){
        return "";
    }


}
