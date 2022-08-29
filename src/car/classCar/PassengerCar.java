package car.classCar;

import car.StartCarException;
import car.component.*;
import car.component.Transmission;
import car.factoryCar.CountryList;

//Легковое
public abstract class PassengerCar extends Car {
    private CruiseControl сruiseControl;

    public PassengerCar(double price, Transmission transmission, String color, int maxSpeed,
                        Electrics electrics, GasTank gasTank, Headlights headlights, Motor motor, Wheel[] wheels,
                        CruiseControl сruiseControl, WheelRadius wheelRadius, CountryList countryList) {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, wheelRadius,
                countryList);
        this.сruiseControl = сruiseControl;
    }

    public CruiseControl getСruiseControl() {
        return сruiseControl;
    }
}
