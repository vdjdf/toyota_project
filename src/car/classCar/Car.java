package car.classCar;

import car.StartCarException;
import car.component.*;
import car.component.Transmission;

import static car.component.Wheel.chekWheels;

public abstract class Car {
    private double price;
    private String color;
    private int maxSpeed;
    private boolean move = false;
    private Transmission transmission;
    private Electrics electrics;
    private GasTank gasTank;
    private Headlights headlights;
    private Motor motor;
    private Wheel[] wheels;
    private WheelRadius wheelRadius;


    public Car(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics,
               GasTank gasTank, Headlights headlights, Motor motor, Wheel[] wheels, WheelRadius wheelRadius)  {
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.electrics = electrics;
        this.gasTank = gasTank;
        this.headlights = headlights;
        this.motor = motor;
        this.wheels = wheels;
        this.wheelRadius = wheelRadius;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != wheelRadius) {
                throw new RuntimeException("Радиус передаваемых колес должен быть " + wheel.getWheelRadius());
            }
        }
    }


    public Transmission getTransmission() {
        return transmission;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public boolean checkMotor() throws StartCarException {
        if (!motor.isWorkable()) {
            throw new StartCarException("Мотор сломан");
        }
        return true;
    }

    public boolean checkLiterGasoline() throws StartCarException {
        if (gasTank.getLiterGasoline() <= 0) {
            throw new StartCarException("Бензобак пуст");
        }
        return true;
    }

    public boolean checkElectrics() throws StartCarException {
        if (!electrics.isWorkable()) {
            throw new StartCarException("Электрика сломана");
        }
        return true;
    }

    public boolean checkCar() throws StartCarException {
        if (!chekWheels(wheels)) return false;
        if (!checkMotor()) return false;
        if (!checkLiterGasoline()) return false;
        if (!checkElectrics()) return false;


        return true;
    }

    public void moveOn() throws StartCarException {
        if (checkCar()) {
            setMove(true);
        }
    }

    public void moveOff() {
        setMove(false);
    }

    public void moveInfo() {
        if (isMove()) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина стоит");
        }
    }

    public Headlights getHeadlights() {
        return headlights;
    }

    public void switchWheel(int index, Wheel wheel) {
                if (wheel.getWheelRadius() == wheelRadius) {
            wheels[index] = wheel;
        }
    }

}
