package car.component;

import car.StartCarException;

public class Wheel {
    private int diameter;
    private boolean workable;

    public Wheel(int diameter, boolean workable) {
        this.diameter = diameter;
        this.workable = workable;
    }

    public int getDiameter() {
        return diameter;
    }

    public  boolean isWorkable() {
        return workable;
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
