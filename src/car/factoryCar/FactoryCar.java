package car.factoryCar;

import car.StartCarException;
import car.component.Motor;
import car.component.Transmission;
import car.component.Wheel;
import car.component.WheelRadius;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class FactoryCar {
    private CountryList countryList;
    private FactoryComponent factoryComponent;


    public FactoryCar(CountryList countryList, FactoryComponent factoryComponent) {
        this.factoryComponent = factoryComponent;
        this.countryList = countryList;
        if (!(countryList == factoryComponent.getCountryList())) {
            throw new RuntimeException("Страны не совпадают:" + " Страна производства деталей: " +
                    factoryComponent.getCountryList() + " Страна производства машин: " + countryList);
        }
    }

    public Camry madeCamry(int price, String color) {

        return new Camry(price, Transmission.ROBOT, color, 220, factoryComponent.madeElectrics(),
                factoryComponent.madeGasTank(), factoryComponent.madeHeadlights(), factoryComponent.madeMotor(),
                factoryComponent.madeWheels(WheelRadius.R17), factoryComponent.madeUsb(),
                factoryComponent.madeCruiseControl(), WheelRadius.R17);
    }


    public Dyna madeDyna(int price, String color) {

        return new Dyna(price, Transmission.MECHANICS, color, 200, factoryComponent.madeElectrics(),
                factoryComponent.madeGasTank(), factoryComponent.madeHeadlights(), factoryComponent.madeMotor(),
                factoryComponent.madeWheels(WheelRadius.R20), 200, factoryComponent.madePowerSocket(),
                WheelRadius.R20);
    }

    public Hiance madeHiance(int price, String color) {

        return new Hiance(price, Transmission.MECHANICS, color, 200, factoryComponent.madeElectrics(),
                factoryComponent.madeGasTank(), factoryComponent.madeHeadlights(), factoryComponent.madeMotor(),
                factoryComponent.madeWheels(WheelRadius.R20), 200, factoryComponent.madeSpareWheel(),
                WheelRadius.R20);
    }

    public Solara madeSolara(int price, String color) {

        return new Solara(price, Transmission.ROBOT, color, 220, factoryComponent.madeElectrics(),
                factoryComponent.madeGasTank(), factoryComponent.madeHeadlights(), factoryComponent.madeMotor(),
                factoryComponent.madeWheels(WheelRadius.R16), factoryComponent.madeConvertibleRoof(),
                factoryComponent.madeMiniFridge(), WheelRadius.R16);
    }

}