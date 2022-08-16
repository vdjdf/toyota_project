package car;

public class StartCarException extends Exception{
    String msg;

    public StartCarException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;

    }
}
