package car.warehouseCarVer2;

import car.classCar.Car;

public class ListModelCar<T extends Car> {
    private int sumModelCars;
    private T[] carsList = (T[]) new Car[50];
    private String nameCar;

    public ListModelCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void addModelCar(T car) {
        if (carsList.length == sumModelCars) {
            T[] newCarsList = (T[]) new Car[carsList.length * 2];
            for (int i = 0; i < carsList.length; i++) {
                newCarsList[i] = carsList[i];
            }
            carsList = newCarsList;
        }
        for (int i = 0; i < carsList.length; i++) {
            if (carsList[i] == null) {
                carsList[i] = car;
                sumModelCars++;
                break;
            }
        }
    }

    public Car giveModelCar() {
        Car car = null;
        for (int i = 0; i < carsList.length; i++) {
            if (!(carsList[i] == null)) {
                car = carsList[i];
                carsList[i] = null;
                sumModelCars--;
                break;
            }
        }
        return car;
    }

    public void infoModelCar() {
        System.out.println("На складе  находится : " + sumModelCars + " машин модели " + nameCar);
    }

}
