package car.classCar;

import car.StartCarException;
import car.component.*;
import car.model.Transmission;
import car.model.TypicalCarModel;

//Легковое
public abstract class PassengerCar extends TypicalCarModel {
    private CruiseControl сruiseControl;

    public PassengerCar(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                        Headlights headlights, Motor motor, Wheel[] wheels, CruiseControl сruiseControl)
            throws StartCarException {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels);
        this.сruiseControl = сruiseControl;
    }

    public CruiseControl getСruiseControl() {
        return сruiseControl;
    }
}
