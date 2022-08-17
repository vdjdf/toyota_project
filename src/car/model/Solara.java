package car.model;

import car.StartCarException;
import car.classCar.Сabriolet;
import car.component.*;

//(кабриолет)
public class Solara extends Сabriolet {
    private MiniFridge miniFridge;
    private static final int WHEEL_DIAMETR = 16;
    public Solara(double price,Transmission transmission, String color, int maxSpeed, Electrics electrics, GasTank gasTank,
                  Headlights headlights, Motor motor, Wheel[] wheels,
                  ConvertibleRoof convertibleRoof, MiniFridge miniFridge) throws StartCarException {
        super(price,transmission, color, maxSpeed, electrics, gasTank, headlights, motor, wheels, convertibleRoof);
        this.miniFridge = miniFridge;
    }

    public MiniFridge getMiniFridge() {
        return miniFridge;
    }
}

