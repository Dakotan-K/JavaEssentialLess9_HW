package task3;

public class Device {

    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacture = " + getManufacturer() + "; price = " + getPrice() + "; serialNumber = " + getSerialNumber();
    }
}

class Monitor extends Device {

    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacture = " + getManufacturer() + "; price = " + getPrice() + "; serialNumber = " + getSerialNumber() + "; X = " + resolutionX + "; Y = " + resolutionY;
    }
}

class EthernetAdapter extends Monitor {

    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, int speed, String mac) {
        super(manufacturer, price, serialNumber, resolutionX, resolutionY);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}