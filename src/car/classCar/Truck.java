package car.classCar;

import car.StartCarException;
import car.component.*;
import car.model.Transmission;
import car.model.TypicalCarModel;
//Грузовик
public abstract class Truck extends TypicalCarModel {
    private int liftingCapacity; //Грузоподьемность

    public Truck(double price,Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                 Headlights headlights, Motor motor, Wheel[] wheels,int liftingCapacity) throws StartCarException {
        super(price,transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels);
        this.liftingCapacity = liftingCapacity;
    }
}
