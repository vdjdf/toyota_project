package dealerNetwork;

public enum CostPriceCar {
    CAMRY(5000),
    SOLARA(8000),
    HIANCE(10000),
    DYNA(12000);
    private double price;

    CostPriceCar(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}