package car.warehouseVer4;

public class CarNotExistException extends Exception {
    public CarNotExistException(String message) {
        super(message);
    }
}