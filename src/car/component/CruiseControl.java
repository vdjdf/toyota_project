package car.component;

public class CruiseControl extends Detal {
    private boolean cruiseCont = false;


    public void cruiseControlOn() {
        setCruiseCont(true);
    }

    public void cruiseControlOff() {
        setCruiseCont(false);
    }

    public void cruiseControlInfo() {
        if (this.cruiseCont) {
            System.out.println("Круиз-контроль включен");
        } else {
            System.out.println("Круиз-контроль выключен");
        }

    }

    public void setCruiseCont(boolean cruiseCont) {
        this.cruiseCont = cruiseCont;

    }
}
