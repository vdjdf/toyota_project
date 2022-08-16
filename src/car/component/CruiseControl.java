package car.component;

public class CruiseControl {
    private boolean cruiseCont = false;


    public void cruiseControlON() {
        setCruiseCont(true);
    }

    public void cruiseControlOFF() {
        setCruiseCont(false);
    }

    public void cruiseControlINFO() {
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
