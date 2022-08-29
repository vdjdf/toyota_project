package car.warehouseCar;

import car.factoryCar.CountryList;
import car.factoryCar.CountyFactoryNotEqualException;
import car.factoryCar.FactoryCar;
import car.factoryCar.FactoryComponent;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;
import car.warehouseCar.Warehouse;

public class Task3 {
    public static void main(String[] args) throws CountyFactoryNotEqualException {

        Warehouse warehouse = new Warehouse();
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
        System.out.println(warehouse.getCamrySum());
        System.out.println(warehouse.getDynaSum());
        System.out.println(warehouse.getHianceSum());
        System.out.println(warehouse.getSolaraSum());
        Camry camry2 = warehouse.getMeCamry();
        camry2.getСruiseControl().cruiseControlInfo();
        System.out.println(warehouse.getCamrySum());

//        warehouse.addCar(camry2);
//        for (int i = 0; i < camrys.length; i++) {
//            System.out.println(camrys[i]);
//            if(i==150){
//                break;}
//        }
    }
}
