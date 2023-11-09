package org.example;

public class ElectricCar extends ACar
{

    public int batteryCapacity;
    public int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    public int getMaxRangeKm()
    {
        return maxRange;
    }


    public int getWhPrKm()
    {
        return (int) (100/ (batteryCapacity/91.25));
    }


    @Override
    public String getMake() {
        return null;
    }


    public int getRegistrationfee()
    {
        if( getWhPrKm() > 20 )
        {
            return 330;

        } else if ( getWhPrKm() >= 15 && getWhPrKm() <= 20 )
        {
            return 1050;

        } else if ( getWhPrKm() >= 10 && getWhPrKm() <= 15)
        {
            return 2340;

        } else if (getWhPrKm() >= 5 && getWhPrKm() <= 10)
        {
            return 5500;

        } else{
            return 10470;
        }


    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nfee " + getRegistrationfee() +
                "\nIt's got a Battery Capacity " + getBatteryCapacityKWh() + "\n" +
                "With a max rage of: " + getMaxRangeKm() + "km";
    }
}
