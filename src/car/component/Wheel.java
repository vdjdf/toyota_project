package car.component;

import car.StartCarException;

public class Wheel extends DetalWorkable {
 private WheelRadius wheelRadius;

    public Wheel(WheelRadius wheelRadius) {
    super(true);
    this.wheelRadius = wheelRadius;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(WheelRadius wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public static boolean chekWheels(Wheel[] wheels) throws StartCarException  {
        if (wheels.length < 4) {
            throw new StartCarException("Недостаточно колес");

        }
        for (Wheel wheel : wheels) {
            if (!wheel.isWorkable()) {
                throw new StartCarException("Колесо пробито");
            }
        }
        return true;

    }

}
