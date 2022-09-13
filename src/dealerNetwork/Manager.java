package dealerNetwork;

import car.classCar.Car;
import car.factoryCar.FactoryCar;
import car.warehouseVer4.CarNotExistException;
import car.warehouseVer4.WarehouseVer4;

import java.io.IOException;

public class Manager {
    private WarehouseVer4 warehouseVer4;
    private FactoryCar factoryCar;
    private String name;
    private Repost repost = new Repost();

    public Manager(WarehouseVer4 warehouseVer4, FactoryCar factoryCar, String name) {
        this.warehouseVer4 = warehouseVer4;
        this.factoryCar = factoryCar;
        this.name = name;
        repost.setNameManager(name);


    }

    public void report() throws IOException {
        repost.madeRepost();
    }

    public Car saleCar(Buyer buyer) throws CustomerHasNoMoneyException {
        Car car = null;
        if (buyer.getMoney() >= ModelPrice.DYNA.getPrice()) {
          //  repost.setNumberSoldDyna(repost.getNumberSoldDyna() + 1);
            try {

                car = warehouseVer4.getDyna();

            } catch (CarNotExistException e) {
                car = factoryCar.madeDyna(ModelPrice.DYNA.getPrice(), "black");
            }
        } else if (buyer.getMoney() >= ModelPrice.HIANCE.getPrice()) {
         //   repost.setNumberSoldHiance(repost.getNumberSoldHiance() + 1);
            try {
                car = warehouseVer4.getHiance();
            } catch (CarNotExistException e) {
                car = factoryCar.madeHiance(ModelPrice.HIANCE.getPrice(), "black");
            }
        } else if (buyer.getMoney() >= ModelPrice.SOLARA.getPrice()) {
           // repost.setNumberSoldSolara(repost.getNumberSoldSolara() + 1);
            try {
                car = warehouseVer4.getSolara();
            } catch (CarNotExistException e) {
                car = factoryCar.madeSolara(ModelPrice.SOLARA.getPrice(), "black");
            }
        } else if (buyer.getMoney() >= ModelPrice.CAMRY.getPrice()) {
           // repost.setNumberSoldCamry(repost.getNumberSoldCamry() + 1);
            try {
                car = warehouseVer4.getCamry();
            } catch (CarNotExistException e) {
                car = factoryCar.madeCamry(ModelPrice.CAMRY.getPrice(), "black");
            }
        }
        if (car != null) {
            repost.setSoldCarsArray(repost.getAllSoldCars(), car);
            repost.setAllSoldCars(repost.getAllSoldCars() + 1);
            return car;
        }
        throw new CustomerHasNoMoneyException("У клиента " + buyer.getName() + " нет денег");
    }
}