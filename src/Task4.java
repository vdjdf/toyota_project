import car.classCar.Car;
import car.factoryCar.CountryList;
import car.factoryCar.CountyFactoryNotEqualException;
import car.factoryCar.FactoryComponent;
import car.factoryCar.FactoryCar;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;
import car.warehouseVer4.WarehouseVer4;
import dealerNetwork.*;

import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws CountyFactoryNotEqualException, IOException {
        FactoryComponent factoryComponent = new FactoryComponent(CountryList.RUSSIA);
        FactoryCar factoryCar = new FactoryCar(CountryList.RUSSIA, factoryComponent);
        WarehouseVer4 warehouseVer4 = new WarehouseVer4();

        Camry camry = factoryCar.madeCamry(ModelPrice.CAMRY.getPrice(), "black");
        Solara solara = factoryCar.madeSolara(ModelPrice.SOLARA.getPrice(), "black");
        Hiance hiance = factoryCar.madeHiance(ModelPrice.HIANCE.getPrice(), "black");
        Dyna dyna = factoryCar.madeDyna(ModelPrice.DYNA.getPrice(), "black");
        warehouseVer4.addCamry(camry);
        warehouseVer4.addDyna(dyna);
        warehouseVer4.addHiance(hiance);
        warehouseVer4.addSolara(solara);

        Manager manager = new Manager(warehouseVer4, factoryCar, "Никита");
        Buyer[] buyers = {
                new Buyer("Петя", 10000),
                new Buyer("Вася", 12000),
                new Buyer("Вася", 15000),
                new Buyer("Вася", 22000),
                new Buyer("Вася", 11000),
                new Buyer("Вася", 13000),
                new Buyer("Вася", 8000),
                new Buyer("Вася", 30000),
        };
        Сashier cashier = new Сashier();
        for (Buyer buyer : buyers) {
            try {
                Car car = manager.saleCar(buyer);
                cashier.saleCar(car);
            } catch (CustomerHasNoMoneyException e) {
                System.out.println(e.getMessage());
            }
        }
       manager.report();
        Сashier.getIncomes();

    }
}
