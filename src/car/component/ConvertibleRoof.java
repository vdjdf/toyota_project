package car.component;

import car.StartCarException;

public class ConvertibleRoof extends DetalWorkable {
    private boolean convertibleRoofOpen = false;

    public ConvertibleRoof() {
        super(true);
    }
    public boolean convertibleRoofOpen() {
        return convertibleRoofOpen;
    }

    public boolean isConvertibleRoofOpen() {
        return convertibleRoofOpen;
    }

    public void setConvertibleRoofOpen(boolean convertibleRoofOpen) {
        this.convertibleRoofOpen = convertibleRoofOpen;
    }


    public void convertibleRoofOpenON() throws StartCarException {
        if (checkConvertibleRoof()) {
            setConvertibleRoofOpen(true);
        }
    }

    public void convertibleRoofOpenOFF() throws StartCarException {
        if (checkConvertibleRoof()) {
            setConvertibleRoofOpen(false);
        }
    }



    public void convertibleRoofOpenINFO() {
        if (isConvertibleRoofOpen()) {
            System.out.println("Откидная крыша открыта");
        } else {
            System.out.println("Откидная крыша закрыта");
        }
    }

    public boolean checkConvertibleRoof() throws StartCarException {
        if (!isWorkable()) {
            throw new StartCarException("Откидная крыша сломана");
        }
        return true;
    }
}