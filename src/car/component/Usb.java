package car.component;

public class Usb extends Detal {
    private boolean usb = false;
    public void usbSoundOn(){
        setUsb(true);
    }
    public void usbSoundOff(){
        setUsb(false);
    }
    public void usbSoundInfo(){
        if(isUsb()){
            System.out.println("Музыка включена");
        }else {
            System.out.println("Музыка выключена");
        }

    }

    public boolean isUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }
}

