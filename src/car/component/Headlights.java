package car.component;

import car.StartCarException;

//Фары
public class Headlights extends DetalWorkable {
    private boolean headlightsWork = false;

    public Headlights() {
        super(true);
    }

    public boolean isHeadlightsOnn() {
        return headlightsWork;
    }

    public void setHeadlightsOnn(boolean headlightsOnn) {
        this.headlightsWork = headlightsOnn;
    }

    public void headlightsOn() throws StartCarException {
        if (chekHeadlights()) {
            setHeadlightsOnn(true);
        }
    }

    public void headlightsOff() throws StartCarException {
        setHeadlightsOnn(false);
    }

    public void headlightsInfo() {
        if (isHeadlightsOnn()) {
            System.out.println("Фары включены");
        } else {
            System.out.println("Фары выключены");
        }
    }

    public boolean chekHeadlights() throws StartCarException {
        if (!isWorkable()) {
            throw new StartCarException("Фары сломаны");
        }
        return true;
    }
}
