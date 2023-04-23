package Task2_4;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", "AB1234567CD", 120);
        Device device2 = new Device("LG", "AB1234567CD", 200);
        EthernetAdapter ethernetAdapter = new EthernetAdapter(1000, "mac123s4ds");
        Monitor monitor1 = new Monitor(1280, 1024);
        Monitor monitor2 = new Monitor(480, 640);
        System.out.println(device1.toString());
        System.out.println("Device 1 and Monitor 1 : " + monitor1.toString(device1.toString()));
        System.out.println("Device 2 and Monitor 2 : " + monitor2.toString(device2.toString()));
        System.out.println("Equals for devices " + device1.equals(device2));
        System.out.println("Equals for monitors " + monitor1.equals(monitor2));
        System.out.println("Device 1 hashCode = " + device1.hashCode() + "\nDevice 2 hashCode = " + device2.hashCode());
        System.out.println("Monitor 1 hashCode = " + monitor1.hashCode() + "\nMonitor 2 hashCode = " + monitor2.hashCode());
    }
}
