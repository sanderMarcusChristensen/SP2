package org.example;

public class DieselCar extends AFuelCar
{


    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationfee()
    {

        if(!particleFilter)
        {
            return 1000;
        } else




        if( kmPrLitre > 20 )
        {
            return 330 + 130;

        } else if ( kmPrLitre >= 15 && kmPrLitre <= 20 )
        {
            return 1050 + 1390;

        } else if ( kmPrLitre >= 10 && kmPrLitre <= 15)
        {
            return 2340 + 1850;

        } else if (kmPrLitre >= 5 && kmPrLitre <= 10)
        {
            return 5500 + 2770;

        } else{
            return 10470 + 15260;
        }

    }

    public boolean hasParticFilter() {
        return particleFilter;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "The fueltype is: " + getFuelType();
    }






}
