package dealerNetwork;

import car.classCar.Car;

public class Сashier {
    private static double incomes ;

    public void saleCar(Car car) {
        incomes += car.getPrice();
    }

    public static void getIncomes() {
        System.out.println("Доход со всех проданных машин: " + incomes);
    }
}