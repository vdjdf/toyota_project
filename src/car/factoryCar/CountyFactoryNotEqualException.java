package car.factoryCar;

public class CountyFactoryNotEqualException extends RuntimeException{
    String msg;

    public CountyFactoryNotEqualException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;

    }
}


