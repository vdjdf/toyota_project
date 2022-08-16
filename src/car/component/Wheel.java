package car.component;

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

    public boolean isWorkable() {
        return workable;
    }
}
