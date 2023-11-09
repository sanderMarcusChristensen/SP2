package org.example;

import java.text.NumberFormat;
import java.util.ArrayList;

public class FleetOfCars {

    ArrayList <Car> fleet = new ArrayList<Car>();



    public void addCar(Car car)
    {
        fleet.add(car);
    }



    public int getTotalRegistrationFeeForFleet()
    {
        int total = 0;
        for(Car car: fleet)
        {
            total += car.getRegistrationfee();
        }
        return total;
    }


    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        String carsInList = "";
        for (Car car : fleet)
            carsInList += car + "\n\n";
        return carsInList + "There are a total of " + fleet.size() + " cars." + "\nThe total registration fee for the fleet is  " + formatter.format(getTotalRegistrationFeeForFleet());
    }

}
