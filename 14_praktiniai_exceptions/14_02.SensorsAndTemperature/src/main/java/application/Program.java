package application;

public class Program {

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();

        System.out.println("temperature in Kumpula " + kumpula.read());

        Sensor kai = new TemperatureSensor();
        Sensor helsinki = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();

        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kai);
        helsinkiRegion.addSensor(helsinki);

        helsinkiRegion.setOn();

        System.out.println("temperature in Helsinki region " + kumpula.read());

    }

}
