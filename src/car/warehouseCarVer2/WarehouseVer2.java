package car.warehouseCarVer2;

import car.classCar.Car;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class WarehouseVer2 {
    private int allCarsSum;
    private int volumeFreePlace = 1000;
    private ListModelCar<Camry> camrys = new ListModelCar("Камри");
    private ListModelCar<Solara> solaras = new ListModelCar("Солара");
    private ListModelCar<Dyna> dynas = new ListModelCar<>("Дюна");
    private ListModelCar<Hiance> hiances = new ListModelCar<>("Хиасе");


    public void addCar(Car car) {
        if (volumeFreePlace > 0) {
            if (car instanceof Camry) {
                camrys.addModelCar((Camry) car);
            }
            if (car instanceof Solara) {
                solaras.addModelCar((Solara) car);
            }
            if (car instanceof Dyna) {
                dynas.addModelCar((Dyna) car);
            }
            if (car instanceof Hiance) {
                hiances.addModelCar((Hiance) car);
            }
            allCarsSum++;
            volumeFreePlace--;
        }
    }

    public Car giveCar(ModelCar modelCar) {
        Car car = null;
        switch (modelCar) {
            case DYNA:
                car = dynas.giveModelCar();
                break;
            case CAMRY:
                car = camrys.giveModelCar();
                break;
            case HIANCE:
                car = hiances.giveModelCar();
                break;
            case SOLARA:
                car = solaras.giveModelCar();
                break;
        }
        allCarsSum--;
        volumeFreePlace++;
        return car;
    }

    public void numberOfCarsModel(ModelCar modelCar) {
        switch (modelCar) {
            case DYNA:
                dynas.infoModelCar();
                break;
            case CAMRY:
                camrys.infoModelCar();
                break;
            case HIANCE:
                hiances.infoModelCar();
                break;
            case SOLARA:
                solaras.infoModelCar();
                break;
        }

    }

    public void infoFreePlace() {
        System.out.println("Свободных мест на складе : " + volumeFreePlace);
        System.out.println("Всего машин на складе : " + allCarsSum);
        camrys.infoModelCar();
        dynas.infoModelCar();
        hiances.infoModelCar();
        solaras.infoModelCar();
    }
}
