package car.model;

import car.StartCarException;
import car.classCar.Truck;
import car.component.*;

//(грузовой фургон)
public class Dyna extends Truck {
    private PowerSocket powerSocket;
    private static final int WHEEL_DIAMETR = 20;


    public Dyna(double price,Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                Headlights headlights, Motor motor, Wheel[] wheels, int liftingCapacity, PowerSocket powerSocket)
            throws StartCarException {
        super(price,transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, liftingCapacity);
        this.powerSocket = powerSocket;
//        for (Wheel wheel : wheels) {
//            if (!(wheel.getDiameter() == WHEEL_DIAMETR)) {
//                throw new StartCarException("Ошибка: неподходящий деаметр колеса");
//            }
//        }
    }

    public PowerSocket getPowerSocket() {
        return powerSocket;
    }

    public void powerSocket() {
        System.out.println("Зарядка телефона");
    }
}
