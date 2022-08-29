package car.warehouseCar;

import car.classCar.Car;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class Warehouse {
    private int camrySum;
    private int dynaSum;
    private int hianceSum;
    private int solaraSum;
    private int allCarsSum;
    private int volume = 1000;
    private Camry[] carsCamry = new Camry[1000];
    private Dyna[] carsDyna = new Dyna[1000];
    private Hiance[] carsHiance = new Hiance[1000];
    private Solara[] carsSolara = new Solara[1000];



    public void addCar(Car car) {
        if (volume > 0) {
            volume--;
            allCarsSum++;
            if (car instanceof Camry) {
                camrySum++;

            //    increasingArray(carsCamry, camrySum);
                addArray(carsCamry, car);
//                for (int i = 0; i < carsCamry.length; i++) {
//                    if (carsCamry[i] == null) {
//                        carsCamry[i] = (Camry) car;
//                        break;
//                    }
//                }
            }
            if (car instanceof Dyna) {
                dynaSum++;
            //    increasingArray(carsDyna, dynaSum);
                addArray(carsDyna, car);
//                for (int i = 0; i < carsDyna.length; i++) {
//                    if (carsDyna[i] == null) {
//                        carsDyna[i] = (Dyna) car;
//                        break;
//                    }
//                }
            }
            if (car instanceof Hiance) {
                hianceSum++;
            //    increasingArray(carsHiance, hianceSum);
                addArray(carsHiance, car);
//                for (int i = 0; i < carsHiance.length; i++) {
//                    if (carsHiance[i] == null) {
//                        carsHiance[i] = (Hiance) car;
//                        break;
//                    }
//                }
            }
            if (car instanceof Solara) {
                solaraSum++;
             //   increasingArray(carsSolara, camrySum);
                addArray(carsSolara, car);
//                for (int i = 0; i < carsSolaral.length; i++) {
//                    if (carsSolaral[i] == null) {
//                        carsSolaral[i] = (Solara) car;
//                        break;
//                    }
//                }
            }
        }
    }

    public Car[] increasingArray(Car[] carArray, int size) {

        if (carArray.length == size) {
            Car[] newCars = new Car[carArray.length * 2];
            for (int i = 0; i < carArray.length; i++) {
                newCars[i] = carArray[i];
            }
            carArray = newCars;
            return carArray;
        } else {
            return carArray;
        }
    }
    // метод увеличивающий массив

    public void addArray(Car[] carModel, Car car) {
        for (int i = 0; i < carModel.length; i++) {
            if (carModel[i] == null) {
                carModel[i] = car;
                break;
            }
        }
    }
    //метод добавления машины в массив

    public Camry getMeCamry() {
//        Camry camry = null;
//        for (int i = 0; i < carsCamry.length; i++) {
//            if (!(carsCamry[i] == null)) {
//                camry = carsCamry[i];
//                carsCamry[i] = null;
//                camrySum--;
//            }
//        }
//      camrySum--;
        camrySum--;
        return (Camry) getMeCar(carsCamry);

    }

    public Dyna getMeDyna() {
        dynaSum--;
        return (Dyna) getMeCar(carsDyna);
    }

    public Hiance getMeHiance() {
        hianceSum--;
        return (Hiance) getMeCar(carsHiance);
    }

    public Solara getMeSolara() {
        solaraSum--;
        return (Solara) getMeCar(carsSolara);
    }

    public Car getMeCar(Car[] cars) {
        Car car = null;
        for (int i = 0; i < cars.length; i++) {
            if (!(cars[i] == null)) {
                car = cars[i];
                cars[i] = null;

                break;
            }
        }
        return car;
    }
    // метод доставания машины из массива




    public int getCamrySum() {
        return camrySum;
    }

    public int getDynaSum() {
        return dynaSum;
    }

    public int getHianceSum() {
        return hianceSum;
    }

    public int getSolaraSum() {
        return solaraSum;
    }

    public int getAllCarsSum() {
        return allCarsSum;
    }

    public Camry[] getCarsCamry() {
        return carsCamry;
    }

    public int getVolume() {
        return volume;

    }
}
