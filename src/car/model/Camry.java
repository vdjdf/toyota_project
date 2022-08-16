package car.model;

import car.StartCarException;
import car.classCar.PassengerCar;
import car.component.*;

//(легковой авто)
public class Camry extends PassengerCar {
    private Usb usb;


    public Camry(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                 Headlights headlights, Motor motor, Wheel[] wheels, Usb usb, CruiseControl сruiseControl)
            throws StartCarException {
        super(price,transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels,сruiseControl);
        this.usb=usb;
    }


    public Usb getUsb() {
        return usb;
    }
}
