package task4;


public class Main {
    public static void main(String[] args) {
        Device device = new Device("Xiaomi", 10000, "098AN5673");
        Device device1 = new Device("ZTE", 12000, "8126TQ2384G1");
        Monitor monitor = new Monitor("Samsung", 9900, "1982jjJhg974537", 1024, 768);
        Monitor monitor1 = new Monitor("LG", 15900, "991722HNBqu3", 1920, 1080);

        System.out.println(device.toString());
        System.out.println(device1.toString());
        System.out.println(monitor.toString());
        System.out.println(monitor1.toString());

        System.out.println(device.equals(device1));
        System.out.println(monitor.equals(monitor1));
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(device.hashCode());
        System.out.println(device1.hashCode());
    }
}
