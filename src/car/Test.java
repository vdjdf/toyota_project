package car;

import car.component.*;
import car.factoryCar.CountryList;
import car.factoryCar.CountyFactoryNotEqualException;
import car.factoryCar.FactoryCar;
import car.factoryCar.FactoryComponent;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class Test {
    public static void main(String[] args)  {
        FactoryComponent factoryComponent = new FactoryComponent(CountryList.TURKEY);
        FactoryComponent factoryComponent2 = new FactoryComponent(CountryList.RUSSIA);
        FactoryCar factoryCar = new FactoryCar(CountryList.RUSSIA, factoryComponent);
        Camry camry = factoryCar.madeCamry(200, "Красный");
        Dyna dyna = factoryCar.madeDyna(300, "Синий");
        Hiance hiance = factoryCar.madeHiance(400, "Красный");
        Solara solara = factoryCar.madeSolara(500, "Зеленый");
        camry.getСruiseControl().cruiseControlInfo();
        dyna.getPowerSocket().powerPhone();
        hiance.moveInfo();
        solara.getMiniFridge().coolDrink();

        //заправка только двух машин и тест движения
        camry.setGasTank(50);
        dyna.setGasTank(40);

        try {
            camry.moveOn();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }
        try {
            dyna.moveOn();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }
        try {
            hiance.moveOn();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }
        try {
            solara.moveOn();
        } catch (StartCarException e) {
            System.out.println(e.getMsg());
        }

        System.out.print("камри ");
        camry.moveInfo();
        System.out.print("дюна ");
        dyna.moveInfo();
        System.out.print("хиасе ");
        hiance.moveInfo();
        System.out.print("солара ");
        solara.moveInfo();


    }

}
