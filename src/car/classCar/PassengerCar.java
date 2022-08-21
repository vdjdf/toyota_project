package car.classCar;

import car.StartCarException;
import car.component.*;
import car.component.Transmission;

//Легковое
public abstract class PassengerCar extends Car {
    private CruiseControl сruiseControl;

    public PassengerCar(double price, Transmission transmission, String color, int maxSpeed,
                        Electrics electrics, GasTank gasTank, Headlights headlights, Motor motor, Wheel[] wheels,
                        CruiseControl сruiseControl, WheelRadius wheelRadius) {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, wheelRadius);
        this.сruiseControl = сruiseControl;
    }

    public CruiseControl getСruiseControl() {
        return сruiseControl;
    }
}
