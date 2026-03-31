package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException();
        }
        int avg = (int) sensors.stream().mapToInt(Sensor::read).average().orElse(0);
        readings.add(avg);
        return avg;
    }

    public void addSensor(Sensor toAdd) {
        if (toAdd == null) {
            throw new IllegalArgumentException();
        }
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}
