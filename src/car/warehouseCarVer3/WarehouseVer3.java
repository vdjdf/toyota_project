package car.warehouseCarVer3;

import car.classCar.Car;

public class WarehouseVer3 {
    private int freeSpace = 1_000;
    private int countCar = 0;
    private Car[] cars = new Car[1000];


    public <K> K getCar(Class<K> tClass) {
        for (int i = freeSpace; i > 0; i--) {
            if (tClass.isInstance(cars[i - 1])) {
                K car = (K) cars[i - 1];
                cars[i - 1] = null;
                countCar--;
                freeSpace++;
                return car;
            }
        }
        throw new RuntimeException("Машин с таким типом - нет");
    }

    public void addCar(Car car) {
        if (freeSpace > 0) {
            cars[countCar] = car;
            countCar++;
            freeSpace--;
        }
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public int getCountCar() {
        return countCar;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public void setCountCar(int countCar) {
        this.countCar = countCar;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}