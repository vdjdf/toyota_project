package car.classCar;

import car.StartCarException;
import car.component.*;
import car.component.Transmission;

//Кабриолет
public abstract class Сabriolet extends Car {
    private ConvertibleRoof convertibleRoof;


    public Сabriolet(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics,
                     GasTank gasTank, Headlights headlights, Motor motor, Wheel[] wheels,
                     ConvertibleRoof convertibleRoof, WheelRadius wheelRadius) {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, wheelRadius);
        this.convertibleRoof = convertibleRoof;
    }

    public ConvertibleRoof getConvertibleRoof() {
        return convertibleRoof;
    }
}
