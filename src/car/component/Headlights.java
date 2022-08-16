package car.component;

import car.StartCarException;

//Фары
public class Headlights {
    private boolean workable;
    private boolean headlightsWork = false;


    public Headlights(boolean workable) {
        this.workable = workable;
    }

    public boolean isWorkable() {
        return workable;
    }

    public void setWorkable(boolean workable) {
        this.workable = workable;
    }

    public boolean isHeadlightsOnn() {
        return headlightsWork;
    }

    public void setHeadlightsOnn(boolean headlightsOnn) {
        this.headlightsWork = headlightsOnn;
    }

    public void headlightsOn() throws StartCarException {
        if (chekHeadlights()){
            setHeadlightsOnn(true);
        }
    }

    public void headlightsOFF() throws StartCarException {
        setHeadlightsOnn(false);
    }

    public void headlightsINFO() {
        if (isHeadlightsOnn()) {
            System.out.println("Фары включены");
        } else {
            System.out.println("Фары выкллючены");
        }
    }
    public boolean chekHeadlights() throws StartCarException {
        if (!isWorkable()) {
            throw new StartCarException("Фары сломаны");
        }
        return true;
    }
}
