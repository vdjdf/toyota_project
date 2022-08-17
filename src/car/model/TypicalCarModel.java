package car.model;

import car.StartCarException;
import car.component.*;

import static car.component.Wheel.chekWheels;

public abstract class TypicalCarModel {
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




    public TypicalCarModel(double price, Transmission transmission, String color, int maxSpeed, Electrics electrics,
                           GasTank gasTank, Headlights headlights, Motor motor, Wheel[] wheels) throws StartCarException {
        this.price = price;
        switch (transmission) {
            case Robot:
            case Automatic:
            case Mechanics:
                break;
        }
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.electrics = electrics;
        this.gasTank = gasTank;
        this.headlights = headlights;
        this.motor = motor;
        //  wheels = new Wheel[4];
        this.wheels = wheels;

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

    public boolean chekMotor() throws StartCarException {
        if (!motor.isWorkable()) {
            throw new StartCarException("Мотор сломан");
        }
        return true;

    }

    public boolean chekLiterGasoline() throws StartCarException {
        if (gasTank.getLiterGasoline() <= 0) {
            throw new StartCarException("Бензобак пуст");
        }
        return true;
    }

    public boolean chekElectrics() throws StartCarException {
        if (!electrics.isWorkable()) {
            throw new StartCarException("Электрика сломана");
        }
        return true;
    }

    public boolean chekCar() throws StartCarException {
        if (!chekWheels(wheels)) return false;
        if (!chekMotor()) return false;
        if (!chekLiterGasoline()) return false;
        if (!chekElectrics()) return false;


        return true;
    }

    public void moveON() throws StartCarException {
        if (chekCar()) {
            setMove(true);
        }
    }

    public void moveOFF() {
        setMove(false);
    }

    public void moveINFO() {
        if (isMove()) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина стоит");
        }
    }

    public Headlights getHeadlights() {
        return headlights;
    }

    public  void wheelReplacement(Wheel wheel, Wheel wheel2){
        if (wheel.getDiameter()==wheel2.getDiameter()){
            wheel=wheel2;
            System.out.println("Колесо заменено");
        }
    }
}
