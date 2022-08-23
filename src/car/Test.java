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
    public static void main(String[] args) throws StartCarException, CountyFactoryNotEqualException{
        FactoryComponent factoryComponent = new FactoryComponent(CountryList.RUSSIA);
        FactoryComponent factoryComponent2 = new FactoryComponent(CountryList.RUSSIA);
        FactoryCar factoryCar = new FactoryCar(CountryList.RUSSIA,factoryComponent);
        Camry camry = factoryCar.madeCamry(200, "Красный");
        Dyna dyna = factoryCar.madeDyna(300, "Синий");
        Hiance hiance = factoryCar.madeHiance(400, "Красный");
        Solara solara = factoryCar.madeSolara(500, "Зеленый");
        camry.getСruiseControl().cruiseControlInfo();
        dyna.getPowerSocket().powerPhone();
        hiance.moveInfo();
        solara.getMiniFridge().coolDrink();


    }

}
