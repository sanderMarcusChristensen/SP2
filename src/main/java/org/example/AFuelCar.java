package org.example;

public abstract class AFuelCar extends ACar
{

    final int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }





    public abstract String getFuelType();



    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "The KmprLiter is: " + getKmPrLitre();
    }


}
