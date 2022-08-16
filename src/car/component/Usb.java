package car.component;

public class Usb {
    private boolean usb = false;
    public void usbSoundON(){
        setUsb(true);
    }
    public void usbSoundOFF(){
        setUsb(false);
    }
    public void usbSoundINFO(){
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
