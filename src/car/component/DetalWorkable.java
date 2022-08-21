package car.component;

public abstract class  DetalWorkable extends Detal {
    private boolean workable;

    public DetalWorkable(boolean workable) {
        this.workable = workable;
    }

    public boolean isWorkable() {
        return workable;
    }

    public void setWorkable(boolean workable) {
        this.workable = workable;
    }
}
