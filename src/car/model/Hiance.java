package car.model;

import car.StartCarException;
import car.classCar.Truck;
import car.component.*;
import car.factoryCar.CountryList;

//(грузовой фургон)
public class Hiance extends Truck {
    private Wheel spareWheel;

    public Hiance(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics,
                  GasTank gasTank,
                  Headlights headlights, Motor motor, Wheel[] wheels, int liftingCapacity, Wheel spareWheel,
                  WheelRadius wheelRadius, CountryList countryList) {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor,
                wheels, liftingCapacity, wheelRadius, countryList);
        this.spareWheel = spareWheel;
    }
}