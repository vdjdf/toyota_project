package car.classCar;

import car.StartCarException;
import car.component.*;
import car.component.Transmission;

//Грузовик
public abstract class Truck extends Car {
    private int liftingCapacity; //Грузоподьемность

    public Truck(double price,Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                 Headlights headlights, Motor motor, Wheel[] wheels,int liftingCapacity,WheelRadius wheelRadius) {
        super(price,transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels,wheelRadius);
        this.liftingCapacity = liftingCapacity;
    }
}
