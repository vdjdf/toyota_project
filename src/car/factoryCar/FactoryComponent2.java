package car.factoryCar;

import car.component.*;

public class FactoryComponent2<T extends Detal> {
    private CountryList countryList;
    private ConvertibleRoof convertibleRoof;
    private CruiseControl cruiseControl;
    private Electrics electrics;
    private GasTank gasTank;
    private Headlights headlights;
    private MiniFridge miniFridge;
    private Motor motor;
    private PowerSocket powerSocket;
    //private Transmission transmission;
    private Usb usb;
    private Wheel wheel;
    private Wheel[] wheels;
    private T detal;


    public FactoryComponent2(CountryList countryList) {
        this.countryList = countryList;
    }

    public ConvertibleRoof madeConvertibleRoof() {
        return new ConvertibleRoof();
    }

    public CruiseControl madeCruiseControl() {
        return new CruiseControl();
    }

    public Electrics madeElectrics() {
        return new Electrics();
    }

    public GasTank madeGasTank() {
        return new GasTank();
    }

    public Headlights madeHeadlights() {
        return new Headlights();
    }

    public MiniFridge madeMiniFridge() {
        return new MiniFridge();
    }

    public Motor madeMotor() {
        return new Motor();
    }

    public PowerSocket madePowerSocket() {
        return new PowerSocket();
    }

    public Usb madeUsb() {
        return new Usb();
    }

    public Wheel madeSpareWheel() {
        return new Wheel(WheelRadius.R20);
    }

    public Wheel[] madeWheels(WheelRadius WheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(WheelRadius);
        }
        return wheels;
    }

    public CountryList getCountryList() {
        return countryList;
    }
}
