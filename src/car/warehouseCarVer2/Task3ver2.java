package car.warehouseCarVer2;

import car.factoryCar.CountryList;
import car.factoryCar.CountyFactoryNotEqualException;
import car.factoryCar.FactoryCar;
import car.factoryCar.FactoryComponent;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class Task3ver2 {
    public static void main(String[] args) throws CountyFactoryNotEqualException {
        WarehouseVer2 warehouse = new WarehouseVer2();
        FactoryComponent factoryComponent = new FactoryComponent(CountryList.RUSSIA);
        FactoryCar factoryCar = new FactoryCar(CountryList.RUSSIA, factoryComponent);
        for (int i = 0; i < 130; i++) {
            Camry camry = factoryCar.madeCamry(100, "red");
            Dyna dyna = factoryCar.madeDyna(10000, "green");
            Hiance hiance = factoryCar.madeHiance(5000, "black");
            Solara solara = factoryCar.madeSolara(6666, "pink");
            warehouse.addCar(camry);
            warehouse.addCar(dyna);
            warehouse.addCar(hiance);
            warehouse.addCar(solara);
        }
        warehouse.numberOfCarsModel(ModelCar.CAMRY);

        Camry camry = (Camry) warehouse.giveCar(ModelCar.CAMRY);
        camry.getСruiseControl().cruiseControlInfo();

        warehouse.numberOfCarsModel(ModelCar.CAMRY);
        warehouse.infoFreePlace();


    }

}