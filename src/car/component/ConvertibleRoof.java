package car.component;

import car.StartCarException;

public class ConvertibleRoof {
    private boolean workable;
    private boolean convertibleRoofOpen = false;

    public ConvertibleRoof(boolean workable) {
        this.workable = workable;
    }

    public boolean isWorkable() {
        return workable;
    }

    public void setWorkable(boolean workable) {
        this.workable = workable;
    }

    public boolean isConvertibleRoofOpen() {
        return convertibleRoofOpen;
    }

    public void setConvertibleRoofOpen(boolean convertibleRoofOpen) {
        this.convertibleRoofOpen = convertibleRoofOpen;
    }


    public void convertibleRoofOpenON() throws StartCarException {
        if (chekConvertibleRoof()){
            setConvertibleRoofOpen(true);
        }
    }

    public void convertibleRoofOpenOFF() throws StartCarException {
        if (chekConvertibleRoof()){
        setConvertibleRoofOpen(false);}
    }

    public void convertibleRoofOpenINFO() {
        if (isConvertibleRoofOpen()) {
            System.out.println("Откидная крыша открыта");
        } else {
            System.out.println("Откидная крыша закрыта");
        }
    }

    public boolean chekConvertibleRoof() throws StartCarException {
        if (!isWorkable()) {
            throw new StartCarException("Откидная крыша сломана");
        }
        return true;
    }
}