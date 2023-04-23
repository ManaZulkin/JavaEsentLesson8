package Task2_4;

public class Device {
    String manufacture, serialNumber;
    float price;
    private boolean booleanValue = true;
    private  float floatValue = price;
    private double doubleValue = 9873234.123;
    private byte[] arrayValue = {1, 2, 3, 4};
    private long longValue = 1231234422L;
    private char charValue = 'd';

    public Device(String manufacture,String serialNumber, float price){
        this.manufacture = manufacture;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String toString(){
        return "manufacture = " + this.manufacture + ", price = " + this.price + ", serialNumber = " + this.serialNumber;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (serialNumber != device.serialNumber) return false;
        return true;
    }
    public int hashCode() {
        int result = 17;
        String stringValue1 = this.manufacture,
                stringValue2 = this.serialNumber;
        result = 37 * result + (booleanValue ? 1 : 0);
        result = 37 * result + (int) charValue;
        result = 37 * result + (int) (longValue ^ (longValue >>> 32));
        result = 37 * result + (stringValue1 == null ? 0 : stringValue1.hashCode());
        result = 37 * result + (stringValue2 == null ? 0 : stringValue2.hashCode());
        result = 37 * result + Float.floatToIntBits(floatValue);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : arrayValue)
            result = 37 * result + (int) b;

        return result;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
class Monitor{
    int resolutionX, resolutionY;
    private double doubleValue = 9873234.123;
    private byte[] arrayValue = {1, 2, 3, 4};
    private boolean booleanValue = true;
    private long longValue = 1231234422L;
    private char charValue = 'd';

    public Monitor(int resolutionX, int resolutionY){
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionY != monitor.resolutionY && resolutionX != monitor.resolutionX) return false;
        return true;
    }

    public String toString() {
        return "X = " + resolutionX + ", Y = " + resolutionY;
    }
    public String toString(String st) {
        return st + ", X = " + resolutionX + ", Y = " + resolutionY;
    }
    public int hashCode() {
        int result = 17;
        float floatValue1 = this.resolutionX, floatValue2 = this.resolutionY;
        result = 37 * result + (booleanValue ? 1 : 0);
        result = 37 * result + (int) charValue;
        result = 37 * result + (int) (longValue ^ (longValue >>> 32));
        result = 37 * result + Float.floatToIntBits(floatValue1);
        result = 37 * result + Float.floatToIntBits(floatValue2);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : arrayValue)
            result = 37 * result + (int) b;

        return result;
    }
    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}

class EthernetAdapter{
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac){
        this.mac = mac;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return " speed=" + speed + ", mac='" + mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
