package car.model;

import car.StartCarException;
import car.classCar.Truck;
import car.component.*;

//(грузовой фургон)
public class Hiance extends Truck {
    private Wheel spareWheel;
    private static final int WHEEL_DIAMETR = 20;


    public Hiance(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                  Headlights headlights, Motor motor, Wheel[] wheels, int liftingCapacity, Wheel spareWheel)
            throws StartCarException {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, liftingCapacity);
        this.spareWheel = spareWheel;
        for (Wheel wheel : wheels) {
            if (!(wheel.getDiameter() == WHEEL_DIAMETR)) {
                throw new StartCarException("Ошибка: неподходящий деаметр колеса");
            }
        }

    }
}