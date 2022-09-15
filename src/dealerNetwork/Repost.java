package dealerNetwork;

import car.classCar.Car;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Repost {
    private String nameManager;

    private int allSoldCars;
    private Car[] soldCars = new Car[100];
    private double allIncome;
    private double allOutcome;
    private double allNetProfit;


    public void madeRepost() throws IOException {
        String report = "src/dealerNetwork/report.txt";
        FileWriter fileWriter = new FileWriter(report);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("Имя менеджера :  " + nameManager + "\n");
        int x = 0;
        for (Car car : soldCars) {
            ;
            x++;
            if (car instanceof Camry) {
                writer.write("Camry №" + x + " " + ModelPrice.CAMRY.getPrice() + " "
                        + CostPriceCar.CAMRY.getPrice() + "\n");
                allIncome += ModelPrice.CAMRY.getPrice();
                allOutcome += CostPriceCar.CAMRY.getPrice();

            }
            if (car instanceof Dyna) {
                writer.write("Dyna №" + x + " - " + ModelPrice.DYNA.getPrice() + " - "
                        + CostPriceCar.DYNA.getPrice() + "\n");
                allIncome += ModelPrice.DYNA.getPrice();
                allOutcome += CostPriceCar.DYNA.getPrice();

            }
            if (car instanceof Hiance) {
                writer.write("Hiance №" + x + " - " + ModelPrice.HIANCE.getPrice() + " - "
                        + CostPriceCar.HIANCE.getPrice() + "\n");
                allIncome += ModelPrice.HIANCE.getPrice();
                allOutcome += CostPriceCar.HIANCE.getPrice();

            }
            if (car instanceof Solara) {
                writer.write("Solara №" + x + " - " + ModelPrice.SOLARA.getPrice() + " - "
                        + CostPriceCar.SOLARA.getPrice() + "\n");
                allIncome += ModelPrice.SOLARA.getPrice();
                allOutcome += CostPriceCar.SOLARA.getPrice();

            }
        }
        allNetProfit = allIncome - allOutcome;
        writer.write(" Итог : доходы - " + allIncome + " расходы - " + allOutcome +
                " прибыль - " + allNetProfit);
        writer.close();

    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getAllSoldCars() {
        return allSoldCars;
    }

    public void setAllSoldCars(int allSoldCars) {
        this.allSoldCars = allSoldCars;
    }


    public void setSoldCarsArray(int carIndex, Car car) {
        soldCars[carIndex] = car;
    }
}
