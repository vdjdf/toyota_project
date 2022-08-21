package car.model;

import car.StartCarException;
import car.classCar.Truck;
import car.component.*;

//(грузовой фургон)
public class Dyna extends Truck {
    private PowerSocket powerSocket;

    public Dyna(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                Headlights headlights, Motor motor, Wheel[] wheels, int liftingCapacity, PowerSocket powerSocket,
                WheelRadius wheelRadius) throws StartCarException {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels,
                liftingCapacity, wheelRadius);
        this.powerSocket = powerSocket;

    }

    public PowerSocket getPowerSocket() {
        return powerSocket;
    }

    public void powerSocket() {
        System.out.println("Зарядка телефона");
    }
}
