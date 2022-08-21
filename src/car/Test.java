package car;

import car.component.*;
import car.model.Camry;

public class Test {
    public static void main(String[] args) throws StartCarException {
        Wheel[] wheels = generateWheels(WheelRadius.R17);
        GasTank gasTank = new GasTank(55);
        Motor motor = new Motor();
        Electrics electrics = new Electrics();
        Headlights headlights = new Headlights();
        CruiseControl cruiseControl = new CruiseControl();
        Usb usb = new Usb();
        Camry camry = new Camry(10000,Transmission.ROBOT,"Красный",220,electrics,gasTank,
                headlights,motor,wheels,usb,cruiseControl,WheelRadius.R17);
    }
        public static Wheel[] generateWheels(WheelRadius WheelRadius) {
            Wheel[] wheels = new Wheel[4];
            for (int i = 0; i < 4; i++) {
                wheels[i] = new Wheel(WheelRadius);
            }
            return wheels;}
}
