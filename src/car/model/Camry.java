package car.model;

import car.StartCarException;
import car.classCar.PassengerCar;
import car.component.*;

//(легковой авто)
public class Camry extends PassengerCar {
    private Usb usb;
    private static final int WHEEL_DIAMETR = 17;


    public Camry(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                 Headlights headlights, Motor motor, Wheel[] wheels, Usb usb, CruiseControl cruiseControl)
            throws StartCarException {

        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, cruiseControl);
        this.usb = usb;

            for (Wheel wheel : wheels) {
                if (!(wheel.getDiameter() == WHEEL_DIAMETR)) {
                    throw new StartCarException("Ошибка: неподходящий деаметр колеса");
                }
            }
        }


    public Usb getUsb() {
        return usb;
    }
}
