package car;

import car.component.*;
import car.model.*;

public class Runner {
    public static void main(String[] args) throws StartCarException {
        System.out.println("Проверка методов Camry:");
        Wheel wheelCamry1 = new Wheel(17, true);
        Wheel wheelCamry2 = new Wheel(17, true);
        Wheel wheelCamry3 = new Wheel(17, true);
        Wheel wheelCamry4 = new Wheel(17, true);
        Wheel[] wheelsCamry = {wheelCamry1, wheelCamry2, wheelCamry3, wheelCamry4};
        Motor motorCamry = new Motor(true);
        Electrics electricsCamry = new Electrics(true);
        GasTank gasTankCamry = new GasTank(15);
        Headlights headlightsCamry = new Headlights(true);
        Usb usb = new Usb();
        CruiseControl cruiseControl = new CruiseControl();

        try {
            Camry camry = new Camry(10000, Transmission.Mechanics, "Серый", 150, electricsCamry,
                    gasTankCamry, headlightsCamry, motorCamry, wheelsCamry, usb, cruiseControl);

            camry.moveON();
            camry.moveINFO();
            camry.moveOFF();
            camry.moveINFO();
            camry.getUsb().usbSoundINFO();
            camry.getUsb().usbSoundON();
            camry.getUsb().usbSoundINFO();
            camry.getСruiseControl().cruiseControlINFO();
            camry.getСruiseControl().cruiseControlON();
            camry.getСruiseControl().cruiseControlINFO();
            camry.getHeadlights().headlightsINFO();
            camry.getHeadlights().headlightsOn();
            camry.getHeadlights().headlightsINFO();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }

//        try {
//           ТУТ БЫЛ МЕТОТ ВЫЗОВА ФАР ON
//        } catch (StartCarException e) {
//            System.out.println(e.getMsg());
//        }

        System.out.println("\nПроверка методов Dyna:");
        Wheel wheelDyna1 = new Wheel(20, true);
        Wheel wheelDyna2 = new Wheel(20, true);
        Wheel wheelDyna3 = new Wheel(20, true);
        Wheel wheelDyna4 = new Wheel(20, true);
        Wheel[] wheelsDyna = {wheelDyna1, wheelDyna2, wheelDyna3, wheelDyna4};
        Motor motorDyna = new Motor(true);
        Electrics electricsDyna = new Electrics(true);
        GasTank gasTankDyna = new GasTank(70);
        Headlights headlightsDyna = new Headlights(true);
        PowerSocket powerSocket = new PowerSocket();
        try {
            Dyna dyna = new Dyna(15000, Transmission.Mechanics, "Зеленый", 90, electricsDyna,
                    gasTankDyna, headlightsDyna, motorDyna, wheelsDyna, 10000, powerSocket);

            dyna.moveON();
            dyna.moveINFO();
            dyna.moveOFF();
            dyna.moveINFO();
            dyna.getHeadlights().headlightsINFO();
            dyna.getHeadlights().headlightsOn();
            dyna.getHeadlights().headlightsINFO();
            dyna.getPowerSocket().powerPhone();

        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }

        System.out.println("\nПроверка методов Hiace:");
        Wheel wheelHiace1 = new Wheel(20, true);
        Wheel wheelHiace2 = new Wheel(20, true);
        Wheel wheelHiace3 = new Wheel(20, true);
        Wheel wheelHiace4 = new Wheel(20, true);
        Wheel spareWheel = new Wheel(20, true);
        Wheel[] wheelsHiace = {wheelHiace1, wheelHiace2, wheelHiace3, wheelHiace4};
        Motor motorHiace = new Motor(true);
        Electrics electricsHiace = new Electrics(true);
        GasTank gasTankHiace = new GasTank(60);
        Headlights headlightsHiace = new Headlights(true);
        try {
            Hiance hiance = new Hiance(20000, Transmission.Automatic, "Розовый", 140, electricsHiace,
                    gasTankHiace, headlightsHiace, motorHiace, wheelsHiace, 500, spareWheel);
            hiance.moveON();
            hiance.moveINFO();
            hiance.moveOFF();
            hiance.moveINFO();
            hiance.getHeadlights().headlightsINFO();
            hiance.getHeadlights().headlightsOn();
            hiance.getHeadlights().headlightsINFO();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }


        System.out.println("\nПроверка методов Solara:");
        Wheel wheelSolara1 = new Wheel(16, true);
        Wheel wheelSolara2 = new Wheel(16, true);
        Wheel wheelSolara3 = new Wheel(16, true);
        Wheel wheelSolara4 = new Wheel(16, true);
        Wheel spareSolara = new Wheel(16, true);
        Wheel[] wheelsSolara = {wheelSolara1, wheelSolara2, wheelSolara3, wheelSolara4};
        Motor motorSolara = new Motor(true);
        Electrics electricsSolara = new Electrics(true);
        GasTank gasTankSolara = new GasTank(55);
        Headlights headlightsSolara = new Headlights(true);
        ConvertibleRoof convertibleRoofSolara = new ConvertibleRoof(true);
        MiniFridge miniFridgeSolara = new MiniFridge();

        try {
            Solara solara = new Solara(25000, Transmission.Robot, "Красный", 200, electricsSolara,
                    gasTankSolara, headlightsSolara, motorSolara, wheelsSolara, convertibleRoofSolara, miniFridgeSolara);
            solara.moveON();
            solara.moveINFO();
            solara.moveOFF();
            solara.moveINFO();
            solara.getHeadlights().headlightsINFO();
            solara.getHeadlights().headlightsOn();
            solara.getHeadlights().headlightsINFO();

            solara.getConvertibleRoof().convertibleRoofOpenINFO();
            solara.getConvertibleRoof().convertibleRoofOpenINFO();
            solara.getMiniFridge().coolDrink();
            solara.getConvertibleRoof().convertibleRoofOpenON();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }


    }

}
