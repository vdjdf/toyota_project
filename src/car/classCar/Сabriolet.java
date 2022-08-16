package car.classCar;

import car.StartCarException;
import car.component.*;
import car.model.Transmission;
import car.model.TypicalCarModel;

//Кабриолет
public abstract class Сabriolet extends TypicalCarModel {
    private ConvertibleRoof convertibleRoof;


    public Сabriolet(double price,Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                     Headlights headlights, Motor motor, Wheel[] wheels, ConvertibleRoof convertibleRoof)
            throws StartCarException {
        super(price, transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels);
        this.convertibleRoof = convertibleRoof;
    }

    public ConvertibleRoof getConvertibleRoof() {
        return convertibleRoof;
    }
}
